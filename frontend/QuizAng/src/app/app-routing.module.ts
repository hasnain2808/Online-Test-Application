import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { QuizComponent } from './quiz/quiz.component';
import { ReviewComponent } from './review/review.component';
import { ResultComponent } from './result/result.component';


const routes: Routes = [

  { path: 'Quiz', component: QuizComponent },
  { path: 'Result', component: ResultComponent },
  { path: 'Review', component: ReviewComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
