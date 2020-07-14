package com.project.quiz.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.quiz.dao.UserDAO;
import com.project.quiz.model.User;
import com.project.quiz.service.RevService;

@Service
public class RevServiceImpl implements RevService {
	@Autowired
	private UserDAO dao;

	@Override
	public List<User> getAllUsers() {
//		dao.save(user);
//		user.getResponse().forEach(res -> res.setUser(user));
//		quizdao.saveAll(user.getResponse());
//		user.getResponse().forEach(res -> res.setQuestion(questiondao.findById(res.getQuestion().getId()).get()));
		List<User> user = dao.findAll();
		return user;
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		Optional<User> optinalEntity = dao.findById(id);
		User user = optinalEntity.get();

		return user;
	}

//	@Override
//	public List<Question> getAllQuestionsAnswers() {
//		List<Question> questionList = dao.findAll();
//		questionList.forEach(question-> question.getAnswerOption().forEach(answer->answer.setCorrectAnswer(false)));
//		
//		
//		questionList.forEach(questionI -> System.out.println(questionI));
//		return dao.findAll();
//	}
//
//	@Override
//	public List<Question> getAllQuestions() {
//		List<Question> questionList = dao.findAll();
//		questionList.forEach(questionI -> System.out.println(questionI));
//		return dao.findAll();
//	}
//	
//	private AnswerOption findTrueAnswer(List<AnswerOption> answerOptionList) {
//		AnswerOption answer = answerOptionList.stream()
//				  .filter(ans -> ans.isCorrectAnswer()==true)
//				  .findAny()
//				  .orElse(null);		
//		return answer;
//	}
//	
//	@Override
//	public int getMarks(List<Question> questionList) {
//		int totalMarks = 0;
//		for(Question questionResponse:questionList) {
//			List<AnswerOption> answerOptionList = questionResponse.getAnswerOption();
//			AnswerOption chosenAnswer = findTrueAnswer(questionResponse.getAnswerOption());
//			System.out.println(questionResponse.getId()/*.get()*//*.getAnswerOption()*/);
//			AnswerOption trueAnswer = findTrueAnswer(dao.findById(questionResponse.getId()).get().getAnswerOption());
//			if(chosenAnswer.getAnswer().equals(trueAnswer.getAnswer())) {
//				totalMarks++;
//			}
//		}
//		return totalMarks;
//	}
}
