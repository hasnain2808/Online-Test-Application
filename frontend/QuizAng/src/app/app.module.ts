import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { QuizComponent } from './quiz/quiz.component';
import { HttpClientModule } from '@angular/common/http';
import { QuestionService } from './question.service';
import {FormsModule} from '@angular/forms';
import { ReviewComponent } from './review/review.component';
import { ResultComponent } from './result/result.component'

@NgModule({
  declarations: [
    AppComponent,
    QuizComponent,
    ReviewComponent,
    ResultComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
  ],
  providers: [
    QuestionService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
