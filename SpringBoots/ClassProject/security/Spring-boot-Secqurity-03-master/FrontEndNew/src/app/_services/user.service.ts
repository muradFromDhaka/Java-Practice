import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';

const API_URL_2 = 'http://192.168.20.136:8080/api/test/';
const API_URL = 'http://192.168.20.136:8080/api/test2/';

@Injectable({
  providedIn: 'root',
})
export class UserService {
  constructor(private http: HttpClient) {}

  getPublicContent(): Observable<any> {
    return this.http.get(API_URL_2 + 'all', { responseType: 'text' });
  }

  getUserBoard(): Observable<any> {
    return this.http.get(API_URL + 'user', { responseType: 'text' });
  }

  getModeratorBoard(): Observable<any> {
    return this.http.get(API_URL + 'mod', { responseType: 'text' });
  }

  getAdminBoard(): Observable<any> {
    return this.http.get(API_URL + 'admin', { responseType: 'text' });
  }



  searchUsers(
    searchTerm: string,
    page: number,
    size: number,
    sortBy: string,
    sortDir: string
  ) {
    let params = new HttpParams()
      .set('searchTerm', searchTerm)
      .set('page', page.toString())
      .set('size', size.toString())
      .set('sortBy', sortBy)
      .set('sortDir', sortDir);

    return this.http.get<any>('http://localhost:8080/api/users/search', {
      params,
    });
  }


  searchUsers2(searchTerm:any, page:any, size:any, sortBy:any, sortDir:any){
    return this.http.get('http://localhost:8080/api/users/search?searchTerm='
                             +searchTerm+'&page='+page+'&size='+size+'&sortBy='+sortBy+'&sortDir'+sortDir);
  }

}
