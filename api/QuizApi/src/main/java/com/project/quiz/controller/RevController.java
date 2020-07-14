package com.project.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.quiz.model.User;
import com.project.quiz.service.RevService;

@RestController
@CrossOrigin(origins = "*")
public class RevController {
	@Autowired
	private RevService service;
	private MultiValueMap<String, String> map;

	@GetMapping("/getAllUser")
	public ResponseEntity<List<User>> storeResponse() {
		try {
			return new ResponseEntity<List<User>>(service.getAllUsers(), HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			map = new LinkedMultiValueMap<>();
			map.add("message", e.getMessage());
			return new ResponseEntity<List<User>>(null, map, HttpStatus.NOT_FOUND);
		}

	}
	
	
	@GetMapping("/getUserById/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") int id) {
		try {
			return new ResponseEntity<User>(service.getUserById(id), HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			map = new LinkedMultiValueMap<>();
			map.add("message", e.getMessage());
			return new ResponseEntity<User>(null, map, HttpStatus.NOT_FOUND);
		}

	}
	
}
