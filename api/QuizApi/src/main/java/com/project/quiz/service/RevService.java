package com.project.quiz.service;


import java.util.List;

import com.project.quiz.model.User;

public interface RevService {

public List<User> getAllUsers();

public User getUserById(int id);
}
