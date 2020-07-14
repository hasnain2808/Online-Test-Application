package com.project.quiz.service;

import java.util.List;

import com.project.quiz.model.Question;

public interface QuizService {

	public List<Question> getAllQuestions();

	public int getMarks(List<Question> questionList);

	List<Question> getAllQuestionsAnswers();

}
