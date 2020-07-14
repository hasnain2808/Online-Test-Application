import { QuizResponse } from './quiz-response';

export class UserResponse {
    id:number
    name:string;
    response:QuizResponse[];

    constructor(name:string, response:QuizResponse[] ){
        this.response = response;
        this.name=name;
    }

}
