import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ProductRequest, ProductResponse } from '../models/product.model';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private baseUrl = 'http://localhost:8080/api/products';

  constructor(private http: HttpClient) {}

  /**
   * CREATE PRODUCT
   * POST /api/products
   */
  createProduct(
    product: ProductRequest,
    images?: File[]
  ): Observable<ProductResponse> {

    const formData = new FormData();

    formData.append(
      'product',
      new Blob([JSON.stringify(product)], { type: 'application/json' })
    );

    if (images && images.length > 0) {
      images.forEach(file => {
        formData.append('images', file);
      });
    }

    return this.http.post<ProductResponse>(this.baseUrl, formData);
  }

  /**
   * UPDATE PRODUCT
   * PUT /api/products/{id}
   */
  updateProduct(
    productId: number,
    product: ProductRequest,
    images?: File[]
  ): Observable<ProductResponse> {

    const formData = new FormData();

    formData.append(
      'product',
      new Blob([JSON.stringify(product)], { type: 'application/json' })
    );

    if (images && images.length > 0) {
      images.forEach(file => {
        formData.append('images', file);
      });
    }

    return this.http.put<ProductResponse>(
      `${this.baseUrl}/${productId}`,
      formData
    );
  }

  /**
   * GET ALL PRODUCTS
   * GET /api/products
   */
  getAllProducts(): Observable<ProductResponse[]> {
    return this.http.get<ProductResponse[]>(this.baseUrl);
  }

  /**
   * GET PRODUCT BY ID
   * GET /api/products/{id}
   */
  getProductById(id: number): Observable<ProductResponse> {
    return this.http.get<ProductResponse>(`${this.baseUrl}/${id}`);
  }

  /**
   * DELETE PRODUCT
   * DELETE /api/products/{id}
   */
  deleteProduct(id: number): Observable<void> {
    return this.http.delete<void>(`${this.baseUrl}/${id}`);
  }
}
