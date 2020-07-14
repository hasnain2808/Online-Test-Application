import { Injectable } from '@angular/core';
import { UserResponse } from './user-response';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UsersServiceService {
  private url:string;

  constructor(private http:HttpClient) { 
    this.url="http://localhost:9101/"

  }
  public getAllUsers():Observable<UserResponse[]>{
    return this.http.get<UserResponse[]>(this.url + "getAllUser");
  }

  public getUserById(id: number):Observable<UserResponse>{
    return this.http.get<UserResponse>(this.url + "getUserById/" + id.toString());
  }
}
