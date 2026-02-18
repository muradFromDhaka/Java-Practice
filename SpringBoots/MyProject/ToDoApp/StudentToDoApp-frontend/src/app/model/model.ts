export interface Project {
  projectId?: number;
  projectTitle: string;
  description: string;
  documents: string[];   // URLs coming from backend
  status: string;
  submissionDate: string;  // or Date if you prefer: Date
  createdAt?: string;    
  updatedAt?: string;
}


export enum Status {
  SUBMITTED = 'SUBMITTED',
  PENDING = 'PENDING',
  APPROVED = 'APPROVED',
  REJECTED = 'REJECTED'
}
