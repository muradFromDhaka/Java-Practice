import { Component, OnInit } from '@angular/core';
import { UserService } from '../_services/user.service';

@Component({
  selector: 'app-board-user',
  templateUrl: './board-user.component.html',
  styleUrls: ['./board-user.component.css']
})
export class BoardUserComponent implements OnInit {
[x: string]: any;
  content?: string;

  constructor(private userService: UserService) { }

  ngOnInit(): void {
    this.userService.getUserBoard().subscribe({
      next: data => {
        this.content = data;
      },
      error: err => {
        if (err.error) {
          try {
            const res = JSON.parse(err.error);
            this.content = res.message;
          } catch {
            this.content = `Error with status: ${err.status} - ${err.statusText}`;
          }
        } else {
          this.content = `Error with status: ${err.status}`;
        }
      }
    });
  }


  searchTerm: string = '';
  page: number = 0;  // Default to the first page
  size: number = 10;  // Default page size
  sortBy: string = 'userName';  // Default sorting by userName
  sortDir: string = 'asc';  // Default sorting direction (ascending)

  users: any[] = [];
  totalElements: number = 0;  // Total number of elements for pagination


  // Function to search users
  searchUsers() {
    this.userService.searchUsers(this.searchTerm, this.page, this.size, this.sortBy, this.sortDir)
      .subscribe(response => {
        this.users = response.content;
        this.totalElements = response.totalElements;
      });
  }

  // Function to handle page change (pagination)
  onPageChange(page: number) {
    this.page = page;
    this.searchUsers();
  }

  // Function to handle sorting change
  onSortChange(sortBy: string, sortDir: string) {
    this.sortBy = sortBy;
    this.sortDir = sortDir;
    this.searchUsers();
  }

  get totalPages(): number {
    return Math.ceil(this.totalElements / this.size);
  }
}
