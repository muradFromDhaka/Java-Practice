import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Category } from '../models/models';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  private baseUrl = 'http://localhost:8080/api/categories';

  constructor(private http: HttpClient) {}

  getAll(): Observable<Category[]> {
    return this.http.get<Category[]>(this.baseUrl);
  }

  getById(id: number): Observable<Category> {
    return this.http.get<Category>(`${this.baseUrl}/${id}`);
  }

  create(category: Category, image?: File): Observable<Category> {
    const formData = new FormData();
    formData.append(
      'category',
      new Blob([JSON.stringify(category)], { type: 'application/json' })
    );
    if (image) {
      formData.append('image', image);
    }
    return this.http.post<Category>(this.baseUrl, formData);
  }

  update(id: number, category: Category, image?: File): Observable<Category> {
    const formData = new FormData();
    formData.append(
      'category',
      new Blob([JSON.stringify(category)], { type: 'application/json' })
    );
    if (image) {
      formData.append('image', image);
    }
    return this.http.put<Category>(`${this.baseUrl}/${id}`, formData);
  }

  delete(id: number): Observable<void> {
    return this.http.delete<void>(`${this.baseUrl}/${id}`);
  }
}
