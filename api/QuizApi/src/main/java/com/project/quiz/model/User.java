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
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	@OneToMany(mappedBy = "user", fetch=FetchType.EAGER)
	List<QuizResponse> response = new ArrayList<>();
	public User(int id, String name, List<QuizResponse> response) {
		super();
		this.id = id;
		this.name = name;
		this.response = response;
	}
	public User() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<QuizResponse> getResponse() {
		return response;
	}
	public void setResponse(List<QuizResponse> response) {
		this.response = response;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", response=" + response + "]";
	}	
	
	
}
