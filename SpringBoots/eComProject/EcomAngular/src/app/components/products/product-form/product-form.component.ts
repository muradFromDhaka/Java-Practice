import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductRequest } from 'src/app/models/product.model';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-product-form',
  templateUrl: './product-form.component.html',
  styleUrls: ['./product-form.component.scss']
})
export class ProductFormComponent implements OnInit {

  productForm!: FormGroup;
  isEditMode = false;
  productId!: number;
  loading = false;

  /** Images */
  selectedImages: File[] = [];
  imagePreviews: string[] = [];
  existingImages: string[] = [];

  constructor(
    private fb: FormBuilder,
    private productService: ProductService,
    private route: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.initForm();
    this.detectEditMode();
  }

  private initForm() {
    this.productForm = this.fb.group({
      name: ['', Validators.required],
      description: [''],
      price: [null, [Validators.required, Validators.min(1)]],
      discountPrice: [null],
      sku: [''],
      stockQuantity: [0, [Validators.required, Validators.min(0)]],
      brandId: [null],
      categoryIds: [[]]
    });
  }

  private detectEditMode() {
    const id = this.route.snapshot.paramMap.get('id');
    if (!id) return;

    this.isEditMode = true;
    this.productId = +id;
    this.loadProduct();
  }

  private loadProduct() {
    this.productService.getProductById(this.productId).subscribe({
      next: (product) => {
        this.productForm.patchValue({
          name: product.name,
          description: product.description,
          price: product.price,
          discountPrice: product.discountPrice,
          sku: product.sku,
          stockQuantity: product.stockQuantity
        });

        this.existingImages = product.images || [];
      }
    });
  }

  /** Image Select */
  onImageSelect(event: Event) {
    const input = event.target as HTMLInputElement;
    if (!input.files) return;

    Array.from(input.files).forEach(file => {
      this.selectedImages.push(file);

      const reader = new FileReader();
      reader.onload = () =>
        this.imagePreviews.push(reader.result as string);

      reader.readAsDataURL(file);
    });
  }

  removeNewImage(index: number) {
    this.selectedImages.splice(index, 1);
    this.imagePreviews.splice(index, 1);
  }

  removeExistingImage(index: number) {
    this.existingImages.splice(index, 1);
    // backend delete API থাকলে এখানে call
  }

  submit() {
    if (this.productForm.invalid) return;

    const payload: ProductRequest = this.productForm.value;
    this.loading = true;

    const request$ = this.isEditMode
      ? this.productService.updateProduct(this.productId, payload, this.selectedImages)
      : this.productService.createProduct(payload, this.selectedImages);

    request$.subscribe({
      next: () => {
        this.loading = false;
        this.router.navigate(['/products']);
      },
      error: () => this.loading = false
    });
  }
}
