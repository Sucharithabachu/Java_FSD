import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../model/user';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  loginUrl : string = '';
  signUpUrl : string = '';

  constructor(private http : HttpClient) {

    this.loginUrl = "http://localhost:3000/login";
    this.signUpUrl = "http://localhost:3000/signup";

  }

  login(user : User) : Observable<any> {
    return this.http.post<any>(this.loginUrl,user);
  }

  signUp(user : User) : Observable<any> {
    return this.http.post<any>(this.signUpUrl,user);
  }

}
