package com.project.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.quiz.model.User;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {

}
