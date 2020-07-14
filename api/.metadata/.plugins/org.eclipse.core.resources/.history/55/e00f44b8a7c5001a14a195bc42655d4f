package com.project.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.quiz.service.QuizService;
import com.project.quiz.model.Question;

@RestController
@CrossOrigin(origins = "*")
public class QuizController {
	@Autowired
	private QuizService service;
	private MultiValueMap<String, String> map;

	@GetMapping("/quizAnswers")
	public ResponseEntity<List<Question>> getAllQuestionsAnswers() {

		try {
			
			List<Question> questionList = service.getAllQuestionsAnswers();
			questionList.forEach(questionI -> System.out.println(questionI));
			return new ResponseEntity<List<Question>>(questionList, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			map = new LinkedMultiValueMap<>();
			map.add("message", e.getMessage());
			return new ResponseEntity<List<Question>>(null, map, HttpStatus.NOT_FOUND);

		}
	}

	@GetMapping("/quiz")
	public ResponseEntity<List<Question>> getAllQuestions() {

		try {
			
			List<Question> questionList = service.getAllQuestions();
			questionList.forEach(questionI -> System.out.println(questionI));
			return new ResponseEntity<List<Question>>(questionList, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			map = new LinkedMultiValueMap<>();
			map.add("message", e.getMessage());
			return new ResponseEntity<List<Question>>(null, map, HttpStatus.NOT_FOUND);

		}
	}

	
	
	@PostMapping("/quizCheck")
	public ResponseEntity<Integer> getMarks(@RequestBody List<Question> questionList) {

		try {
			
			
//			List<Question> questionList = service.getAllQuestions();
//			questionList.forEach(questionI -> System.out.println(questionI));
			return new ResponseEntity<Integer>(service.getMarks(questionList), HttpStatus.OK);
		} catch (Exception e) {

			System.out.println(e.getMessage());
			map = new LinkedMultiValueMap<>();
			map.add("message", e.getMessage());
			return new ResponseEntity<Integer>(null, map, HttpStatus.NOT_FOUND);

		}
	}
}
