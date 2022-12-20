import { Injectable } from '@angular/core';
import { Observable, of, throwError } from 'rxjs';

import { Router } from '@angular/router';
import {HttpClient} from "@angular/common/http";
import {User} from "../user";


@Injectable({
  providedIn: 'root'
})
export class UserLoginService {

  constructor(private http:HttpClient) { }

  public doRegistration(user:any){

     return  this.http.post("http://localhost:8080/api/student/register",user,{responseType:'text' as 'json'});

  }

  public getStudentInfo(email:string){
    return this.http.get("http://localhost:8080/api/student/findStudent/"+email);
  }

  setToken(token: string): void {
    localStorage.setItem('token', token);
  }

  getToken(): string | null {
    return localStorage.getItem('token');
  }

  login({email,password}:any):Observable<any>{
       if (email === 'admin@gmail.com' && password === 'admin123') {
             this.setToken('abcdefghijklmnopqrstuvwxyz');
             return of({ name: 'Tarique Akhtar', email: 'admin@gmail.com' });
  }
       return throwError(new Error('Failed to login'));
  }

}
