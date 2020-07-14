package com.project.quiz.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String question;
	@OneToMany(mappedBy = "question", fetch=FetchType.EAGER)
	List<AnswerOption> answerOption = new ArrayList<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<AnswerOption> getAnswerOption() {
		return answerOption;
	}
	public void setAnswerOption(List<AnswerOption> answerOption) {
		this.answerOption = answerOption;
	}
	public Question(int id, String question, List<AnswerOption> answerOption) {
		super();
		this.id = id;
		this.question = question;
		this.answerOption = answerOption;
	}
	public Question(String question, List<AnswerOption> answerOption) {
		super();
		this.question = question;
		this.answerOption = answerOption;
	}
	public Question() {
		super();
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", answerOption=" + answerOption + "]";
	}
	public Question(String question) {
		super();
		this.question = question;
	}

	
	
	

}