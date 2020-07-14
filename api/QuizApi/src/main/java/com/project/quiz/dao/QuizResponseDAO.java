package com.project.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.quiz.model.QuizResponse;

@Repository
public interface QuizResponseDAO extends JpaRepository<QuizResponse, Integer> {

}
