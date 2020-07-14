import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserResponse } from '../user-response';
import { UsersServiceService } from '../users-service.service';
import { UserStoreService } from '../user-store.service';
@Component({
  selector: 'app-review',
  templateUrl: './review.component.html',
  styleUrls: ['./review.component.css']
})
export class ReviewComponent implements OnInit {
  private userResponse: UserResponse[];
  constructor(private service: UsersServiceService, private userstoreservice: UserStoreService, private router: Router) { }
  ngOnInit() {
    this.service.getAllUsers().subscribe(res => {
      this.userResponse = res
    });
  }
  getRes(id: number) {
    console.log(id)
    this.service.getUserById(id).subscribe(res => this.gotoResult(res))
  }
  gotoResult(res) {
    this.userstoreservice.userresponse = res;
    this.router.navigate(['/Result'])
  }
}
