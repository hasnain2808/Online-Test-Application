package com.project.quiz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.quiz.dao.QuestionDAO;
import com.project.quiz.model.AnswerOption;
import com.project.quiz.model.Question;
import com.project.quiz.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService {
	@Autowired
	private QuestionDAO dao;
	@Override
	public List<Question> getAllQuestionsAnswers() {
		List<Question> questionList = dao.findAll();
		questionList.forEach(question-> question.getAnswerOption().forEach(answer->answer.setCorrectAnswer(false)));
		
		
		questionList.forEach(questionI -> System.out.println(questionI));
		return dao.findAll();
	}

	@Override
	public List<Question> getAllQuestions() {
		List<Question> questionList = dao.findAll();
		questionList.forEach(questionI -> System.out.println(questionI));
		return dao.findAll();
	}
	
	private AnswerOption findTrueAnswer(List<AnswerOption> answerOptionList) {
		AnswerOption answer = answerOptionList.stream()
				  .filter(ans -> ans.isCorrectAnswer()==true)
				  .findAny()
				  .orElse(null);		
		return answer;
	}
	
	@Override
	public int getMarks(List<Question> questionList) {
		int totalMarks = 0;
		for(Question questionResponse:questionList) {
			List<AnswerOption> answerOptionList = questionResponse.getAnswerOption();
			AnswerOption chosenAnswer = findTrueAnswer(questionResponse.getAnswerOption());
			System.out.println(questionResponse.getId()/*.get()*//*.getAnswerOption()*/);
			AnswerOption trueAnswer = findTrueAnswer(dao.findById(questionResponse.getId()).get().getAnswerOption());
			if(chosenAnswer.getAnswer().equals(trueAnswer.getAnswer())) {
				totalMarks++;
			}
		}
		return totalMarks;
	}
}
