package com.project.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.quiz.service.ResService;
import com.project.quiz.model.User;

@RestController
@CrossOrigin(origins = "*")
public class ResController {
	@Autowired
	private ResService service;
	private MultiValueMap<String, String> map;

	@PostMapping("/storeResponse")
	public ResponseEntity<User> storeResponse(@RequestBody User user) {

		try {

//			List<Question> questionList = service.getAllQuestions();
//			questionList.forEach(questionI -> System.out.println(questionI));
			System.out.println(user);
			return new ResponseEntity<User>(service.saveResponse(user), HttpStatus.OK);
		} catch (Exception e) {

			System.out.println(e.getMessage());
			map = new LinkedMultiValueMap<>();
			map.add("message", e.getMessage());
			return new ResponseEntity<User>(null, map, HttpStatus.NOT_FOUND);

		}

	}
}
