import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Project } from 'src/app/model/model';
import { ProjectService } from 'src/app/services/project.service';

@Component({
  selector: 'app-project-list',
  templateUrl: './project-list.component.html',
  styleUrls: ['./project-list.component.scss'],
})
export class ProjectListComponent {
  projects: Project[] = [];
  selectedProject?: Project;

  constructor(private projectService: ProjectService, private router: Router) {}

  ngOnInit(): void {
    this.loadProjects();
  }

  loadProjects(): void {
    this.projectService.getAll().subscribe({
      next: (projects) => this.projects = [...projects],
      error: (err) => console.log(err),
    });
  }

  editProject(project: Project): void {
    this.selectedProject = project;
    // Optionally, you can communicate with ProjectFormComponent via @Input() or a service
  }

  deleteProject(projectId: number): void {
    if (confirm('Are you sure you want to delete this project?')) {
      this.projectService.deleteProject(projectId).subscribe({
        next: () => {
          this.loadProjects()
        },
        error: (err) =>console.log(err)
      });
    }
  }

  
  deleteDocument(projectId: number, fileName: string): void {
    if (!confirm('Are you sure you want to delete this document?')) return;

    this.projectService.deleteOneDocument(projectId, fileName).subscribe({
      next: () => {
         this.loadProjects();
        const project = this.projects.find((p) => p.projectId === projectId);
        if (project && project.documents) {
          project.documents = project.documents.filter((f) => f !== fileName);
        }
      },
      error: (err) => console.error(err),
    });
  }


  isImage(fileUrl: string): boolean {
  // Common image extensions
  return /\.(jpg|jpeg|png|gif|bmp)$/i.test(fileUrl);
}


getImage(url: any): string {
    if (!url) return '';

    // Check if URL already contains http or https
    if (url.startsWith('http://') || url.startsWith('https://')) {
      return url; // absolute URL → return directly
    }

    // Otherwise treat as uploaded file
    return 'http://localhost:8080/uploads/' + url;
  }



}
