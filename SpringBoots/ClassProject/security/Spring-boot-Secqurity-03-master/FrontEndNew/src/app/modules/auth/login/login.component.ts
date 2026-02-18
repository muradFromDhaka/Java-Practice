import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/_services/auth.service';
import { StorageService } from 'src/app/_services/storage.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private authService: AuthService, private storageService: StorageService, private router: Router) { }

  ngOnInit(): void {
    if (this.storageService.isLoggedIn()) {

    }
  }
  username: string = '';
  password: string = '';
  errorMessage: string = '';


  onLogin() {
    if (!this.username || !this.password) {
      this.errorMessage = "Username and password are required!";
      return;
    }


    console.log(this.username, this.password);

    // const { username, password } = this.form;


    this.authService.login(this.username, this.password).subscribe({

      next: data => {
        this.storageService.saveUser(data);

        const role = this.storageService.getUserRole();


        if (role) {

          if (role === 'ROLE_ADMIN') {
            this.router.navigate(['/admin']);
          } else if (role === 'ROLE_MODERATOR') {
            console.log('-------------------', role);

            this.router.navigate(['/moderator']);
          } else {
            this.router.navigate(['/user']);
          }
        } else {
          this.errorMessage = "Invalid username or password!";
        }
      },
      error: err => {
        this.errorMessage = err.error.message;
      }
    });

  }
  form: any = {
    username: null,
    password: null
  };

  reloadPage(): void {
    window.location.reload();
  }
}