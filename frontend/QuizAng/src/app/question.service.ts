import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Question } from './question';
import { UserResponse } from './user-response';
import { QuizResponse } from './quiz-response';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class QuestionService {



  private url: string;
  constructor(private http: HttpClient) {
    this.url = "http://localhost:9101/"
  }

  public getAllQuestion(): Observable<Question[]> {
    console.log(this.http.get<Question[]>(this.url + "quizAnswers"))
    return this.http.get<Question[]>(this.url + "quizAnswers");
  }

  public saveResponse(questions: Question[], name: string): Observable<UserResponse[]> {
    var quiz = [];
    questions.forEach(
      question => quiz.push(new QuizResponse(question, question.answerOption.filter(function (ansOpt) {
        return ansOpt.correctAnswer == true;
      })[0])));
    console.log(quiz);
    console.log(this.http.post<UserResponse[]>(this.url + "storeResponse", new UserResponse(name, quiz)))
    return this.http.post<UserResponse[]>(this.url + "storeResponse", new UserResponse(name, quiz));

  }

}
