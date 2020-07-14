import { Injectable } from '@angular/core';
import { UserResponse } from './user-response';
@Injectable({
  providedIn: 'root'
})
export class UserStoreService {
public userresponse: UserResponse;
  constructor() { }
}
