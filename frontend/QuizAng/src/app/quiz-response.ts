import { AnswerOption } from './answer-option';
import { Question } from './question';

export class QuizResponse {
    question:Question;
    answerResponse:AnswerOption;
    constructor(question:Question, answerResponse:AnswerOption ){
        this.answerResponse = answerResponse;
        this.question=question;
    }

}
