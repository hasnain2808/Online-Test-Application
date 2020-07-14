package com.project.quiz.inititializer;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.project.quiz.dao.AnswerOptionDAO;
import com.project.quiz.dao.QuestionDAO;
import com.project.quiz.model.AnswerOption;
import com.project.quiz.model.Question;

@Component
public class QuestionAnswerInitializer implements CommandLineRunner {
	private QuestionDAO questiondao;
	private AnswerOptionDAO answeroptiondao;
	private AnswerOption answerOption;
	private Question question;
	private List<Question> questionList;

	public QuestionAnswerInitializer(QuestionDAO questiondao, AnswerOptionDAO answeroptiondao) {
		super();
		this.questiondao = questiondao;
		this.answeroptiondao = answeroptiondao;
	}

	@Override
	public void run(String... args) throws Exception {

		question = new Question("Which of these is not a SOLID principle ");
		questiondao.save(question);
		answerOption = new AnswerOption("single responsibility principle", question, true);
		answeroptiondao.save(answerOption);
		answerOption = new AnswerOption("open closed principle", question, false);
		answeroptiondao.save(answerOption);
		answerOption = new AnswerOption("THE DEPENDENCY INVERSION PRINCIPLE".toLowerCase(), question, false);
		answeroptiondao.save(answerOption);
		answerOption = new AnswerOption("smaller the better", question, false);
		answeroptiondao.save(answerOption);

		question = new Question("What is the single responsibility principle");
		questiondao.save(question);
		answerOption = new AnswerOption("A module should be responsible to one, and only one, actor.", question, true);
		answeroptiondao.save(answerOption);
		answerOption = new AnswerOption("A module should be responsible to two  actor.", question, false);
		answeroptiondao.save(answerOption);
		answerOption = new AnswerOption("A module should be responsible to three actor.", question, false);
		answeroptiondao.save(answerOption);
		answerOption = new AnswerOption("Two modules should be responsible one actor.", question, false);
		answeroptiondao.save(answerOption);

		question = new Question("What is open closed principle");
		questiondao.save(question);

		answerOption = new AnswerOption("Protects lower-level components from changes in higher-level components.",
				question, false);
		answeroptiondao.save(answerOption);
		answerOption = new AnswerOption("Protects higher-level components from changes in lower-level components.",
				question, true);
		answeroptiondao.save(answerOption);
		answerOption = new AnswerOption(
				"Does not protects higher-level components from changes in lower-level components.", question, false);
		answeroptiondao.save(answerOption);

		answerOption = new AnswerOption(" is same as SRP.", question, false);
		answeroptiondao.save(answerOption);

		question = new Question("What is the Dependency Inversion Principle");
		questiondao.save(question);

		answerOption = new AnswerOption(
				" source code dependencies refer not only to abstractions, but also to concretions", question, false);
		answeroptiondao.save(answerOption);
		answerOption = new AnswerOption(" source code dependencies refer only to abstractions, not to concretions",
				question, true);
		answeroptiondao.save(answerOption);
		answerOption = new AnswerOption(" source code dependencies refer only to concretions, not to abstractions",
				question, false);
		answeroptiondao.save(answerOption);
		answerOption = new AnswerOption(" source code dependencies refer to abstract concretions", question, false);
		answeroptiondao.save(answerOption);

		questionList = questiondao.findAll();
		questionList.forEach(questionI -> System.out.println(questionI));

	}
}
