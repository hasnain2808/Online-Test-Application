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
public class QuizResponse {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@ManyToOne(fetch = FetchType.EAGER)
	private User user;
	@ManyToOne(fetch = FetchType.EAGER)
	private Question question;
	@ManyToOne(fetch = FetchType.EAGER)
	private AnswerOption answerResponse;

	public QuizResponse(int id, String name, User user, Question question, AnswerOption answerResponse) {
		super();
		this.id = id;
		this.user = user;
		this.question = question;
		this.answerResponse = answerResponse;
	}

	public QuizResponse() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}





	@JsonIgnore
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public AnswerOption getAnswerResponse() {
		return answerResponse;
	}

	public void setAnswerResponse(AnswerOption answerResponse) {
		this.answerResponse = answerResponse;
	}

	@Override
	public String toString() {
		return "QuizResponse [id=" + id + ", question=" + question + ", answerResponse="
				+ answerResponse + "]";
	}

}
