import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Project } from '../model/model';

@Injectable({
  providedIn: 'root'
})
export class ProjectService {

  private baseUrl = "http://localhost:8080/api/projects";

  constructor(private http: HttpClient) {}

  // Get all projects
  getAll(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }

  // Get one project
  getById(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  // Create project
  create(project: Project, files: File[]): Observable<any> {
    const formData = new FormData();

    formData.append("project", new Blob([JSON.stringify(project)], {type: 'application/json'}));

    files.forEach((file) => formData.append("files", file))

    return this.http.post(`${this.baseUrl}/save`, formData);
  }

  // Update project
  update(id: number, project: Project, files: File[]): Observable<any> {
   const formData = new FormData();

   formData.append("project", new Blob([JSON.stringify(project)], {type: 'application/json'}))

   files.forEach((file) => formData.append('files', file))
    return this.http.put(`${this.baseUrl}/update/${id}`, formData);
  }

  // Delete project
  deleteOneDocument(id: number, fileName: string): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}/documents`, {params:{fileName}});
  }

  deleteProject(id:number){
    return this.http.delete(`${this.baseUrl}/project/${id}`)
  }
}
