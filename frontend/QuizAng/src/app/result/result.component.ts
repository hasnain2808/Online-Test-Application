import { Component, OnInit } from '@angular/core';
import { UserStoreService } from '../user-store.service';
import { UserResponse } from '../user-response';
import { Router } from '@angular/router';
import { AnswerOption } from '../answer-option';

@Component({
  selector: 'app-result',
  templateUrl: './result.component.html',
  styleUrls: ['./result.component.css']
})
export class ResultComponent implements OnInit {
  private userresponse: UserResponse;
  private marks: number = 0;

  constructor(private userstoreservice: UserStoreService, private router: Router,) { }

  ngOnInit() {

    if (typeof this.userstoreservice.userresponse == 'undefined') {
      this.router.navigate(['/Review'])

    } else {
      this.userresponse = this.userstoreservice.userresponse;

      for (let res of this.userresponse.response) {
        let corrAnswer: number

        for (let ans of res.question.answerOption) {

          if (ans.correctAnswer) {
            corrAnswer = ans.id
          }
        }
        if (res.answerResponse != null) {
          if (res.answerResponse.id == corrAnswer) {
            this.marks++;
          }

        } else {
          res.answerResponse = new AnswerOption()
          res.answerResponse.id = 0;
          res.answerResponse.correctAnswer = false;

          res.answerResponse.answer = ""
          console.log(res.answerResponse)
        }
      }

      console.log(this.marks)
    }
  }

}
