import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { StorageService } from 'src/app/_services/storage.service';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {

  constructor(private authService: StorageService, private router: Router) {}

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean {
    const role = this.authService.getUserRole();

    const expectedRole = route.data['role'];
    if (!this.authService.isLoggedIn()) {
      this.router.navigate(['/login']);
      return false;
    }
 
    // if (role === 'ROLE_ADMIN') {
    //   this.router.navigate(['/admin']);
    //   return false;
    // }
    // if (role === 'ROLE_MODERATOR') {
    //   this.router.navigate(['/moderator']);
    //   return false;
    // }
    // if (role === 'ROLE_USER') {
    //   this.router.navigate(['/user']);
    //   return false;
    // }

    // this.router.navigate(['/auth/login']);
    // return false;

    if (role !== expectedRole) {
      this.router.navigate(['/unauthorized']); // Redirect if role mismatch
      return false;
    }
    return true;
  }

  // canActivate(
  //   route: ActivatedRouteSnapshot,
  //   state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
  //   return true;
  // }
  
}
