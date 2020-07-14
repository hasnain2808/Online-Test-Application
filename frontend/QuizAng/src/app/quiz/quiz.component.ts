import { Component, OnInit } from '@angular/core';
import { QuestionService } from '../question.service';
import { Question } from '../question';
import { AnswerOption } from '../answer-option';
import { Router } from '@angular/router';
import { UserStoreService } from '../user-store.service';

@Component({
  selector: 'app-quiz',
  templateUrl: './quiz.component.html',
  styleUrls: ['./quiz.component.css']
})
export class QuizComponent implements OnInit {
  private questions: Question[];
  private name: string;

  constructor(private service: QuestionService, private router: Router, private userstoreservice: UserStoreService) { }

  onSelectionChange(questionw: Question, ans: AnswerOption) {
    questionw.answerOption.forEach(ans => ans.correctAnswer = false)
    ans.correctAnswer = true
    console.log(this.questions)
    console.log(this.name)
  }
  checkAnswer() {
    console.log(this.questions);
    console.log(this.name);
    this.service.saveResponse(this.questions, this.name).subscribe(res => this.gotoResult(res))
  }

  gotoResult(res) {
    this.userstoreservice.userresponse = res;
    this.router.navigate(['/Result'])
  }
  ngOnInit() {
    this.service.getAllQuestion().subscribe(res => {
      this.questions = res
    });
    this.name = ""
  }

}
