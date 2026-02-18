import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Project, Status } from 'src/app/model/model';
import { ProjectService } from 'src/app/services/project.service';

@Component({
  selector: 'app-project-form',
  templateUrl: './project-form.component.html',
  styleUrls: ['./project-form.component.scss']
})
export class ProjectFormComponent {


  projectForm!: FormGroup;
  selectedFiles: File[] = [];
  statusList = Object.values(Status); // ['SUBMITTED','PENDING','APPROVED','REJECTED']

  isEditMode = false;
  editingProjectId?: number;

  existingDocuments: string[] = []; // display existing documents

  constructor(
    private fb: FormBuilder,
    private projectService: ProjectService,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.projectForm = this.fb.group({
      projectTitle: ['', [Validators.required, Validators.maxLength(200)]],
      description: ['', Validators.maxLength(200)],
      status: [Status.PENDING, Validators.required],
      submissionDate: ['', Validators.required]
    });
  }

  // Handle new file selection
  onFileSelected(event: any): void {
    if(event.target.files && event.target.files.length > 0){
      this.selectedFiles = Array.from(event.target.files);
    }
  }

  // Submit form (create or update)
  submit(): void {
    if(this.projectForm.invalid){
      this.projectForm.markAllAsTouched();
      return;
    }

    const project: Project = this.projectForm.value;

    if(this.isEditMode && this.editingProjectId){
      this.projectService.update(this.editingProjectId, project, this.selectedFiles)
        .subscribe({
          next: res => {
            alert('Project updated successfully:');
            this.resetForm();
            this.router.navigate(['list']);

          },
          error: err => console.error(err)
        });
    } else {
      this.projectService.create(project, this.selectedFiles)
        .subscribe({
          next: res => {
            alert('Project created successfully:');
            this.resetForm();
            this.router.navigate(['/list']);
          },
          error: err => console.error(err)
        });
    }
  }

  // Load existing project for editing
  loadProject(project: Project): void {
    this.isEditMode = true;
    this.editingProjectId = project.projectId;
    this.projectForm.patchValue({
      projectTitle: project.projectTitle,
      description: project.description,
      status: project.status,
      submissionDate: project.submissionDate
    });
    this.existingDocuments = project.documents || [];
  }

  // Delete existing document
  deleteDocument(fileName: string): void {
    if(!this.editingProjectId) return;

    this.projectService.deleteOneDocument(this.editingProjectId, fileName)
      .subscribe({
        next: res => {
          console.log('Document deleted:', res);
          this.existingDocuments = this.existingDocuments.filter(f => f !== fileName);
        },
        error: err => console.error(err)
      });
  }

  // Reset form after submit
  private resetForm(): void {
    this.projectForm.reset({
      status: Status.PENDING
    });
    this.selectedFiles = [];
    this.existingDocuments = [];
    this.isEditMode = false;
    this.editingProjectId = undefined;
  }

  



}
