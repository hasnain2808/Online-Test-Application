package com.project.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.quiz.model.AnswerOption;

@Repository
public interface AnswerOptionDAO extends JpaRepository<AnswerOption, Integer> {

}
