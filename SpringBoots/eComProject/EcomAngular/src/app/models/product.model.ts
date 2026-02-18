export interface ProductRequest {
  name: string;
  description?: string;
  price: number;
  discountPrice?: number;
  sku?: string;
  stockQuantity: number;
  brandId?: number;
  categoryIds?: number[];
  imageUrls?: string[]; // optional, backend mainly uses Multipart images
}

export interface ProductResponse {
  id: number;
  name: string;
  description?: string;

  price: number;
  discountPrice?: number;

  active?: boolean;
  sku?: string;
  stockQuantity?: number;

  brandName?: string;
  categories?: string[];
  images?: string[];

  createdAt?: string;
}