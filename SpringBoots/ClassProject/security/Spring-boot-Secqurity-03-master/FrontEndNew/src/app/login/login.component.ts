import { Component, OnInit } from '@angular/core';
import { AuthService } from '../_services/auth.service';
import { StorageService } from '../_services/storage.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  form: any = {
    username: null,
    password: null
  };
  isLoggedIn = false;
  isLoginFailed = false;
  errorMessage = '';
  roles: any[] = [];
  username: string=''
  showPassword: boolean = false; // New property to toggle password visibility
  togglePasswordVisibility(): void {
    this.showPassword = !this.showPassword; // Toggle the boolean value
  }
  constructor(private authService: AuthService, private storageService: StorageService) { }

  ngOnInit(): void {
    if (this.storageService.isLoggedIn()) {
      this.isLoggedIn = true;
      this.username = this.storageService.getUser().userName;
      this.roles = this.storageService.getUser().roles;
    }
  }

  onSubmit(): void {
    const { username, password } = this.form;
    // console.log("Role---- -- -- ", this.form)

    this.authService.login(username, password).subscribe({
      
      next: data => {
        // console.log("Role---- -- -- ",data)
        this.reloadPage();
        this.storageService.saveUser(data);
        console.log("Role---- -- -- ",this.storageService.getUser().role)

        this.isLoginFailed = false;
        this.isLoggedIn = true;
        this.roles = this.storageService.getUser().role;

        const user = this.storageService.getUser();

        // console.log("user-----",user)

        this.username = this.storageService.getUser().userName;
        console.log("user name-----",this.username)
     
      },
      error: err => {
        this.errorMessage = err.error.message;
        this.isLoginFailed = true;
      }
    });
  }

  reloadPage(): void {
    window.location.reload();
  }
}
