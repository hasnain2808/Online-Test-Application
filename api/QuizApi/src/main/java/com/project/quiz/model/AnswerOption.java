package com.project.quiz.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class AnswerOption {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String answer;

	@ManyToOne(fetch = FetchType.EAGER)
	private Question question;
	private boolean correctAnswer;

	@Override
	public String toString() {
		return "AnswerOption [id=" + id + ", answer=" + answer + ", correctAnswer=" + correctAnswer + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public boolean isCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(boolean correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public AnswerOption(String answer, Question question, boolean correctAnswer) {
		super();
		this.answer = answer;
		this.question = question;
		this.correctAnswer = correctAnswer;
	}

	public AnswerOption() {
		super();
	}

	public AnswerOption(int id, String answer, Question question, boolean correctAnswer) {
		super();
		this.id = id;
		this.answer = answer;
		this.question = question;
		this.correctAnswer = correctAnswer;
	}

	@JsonIgnore
	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

}
