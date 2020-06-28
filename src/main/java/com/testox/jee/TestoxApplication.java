package com.testox.jee;

import java.io.Console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.testox.jee.service.QuestionOperation;

@SpringBootApplication
public class TestoxApplication {

	public static void main(String[] args) {
		
		ApplicationContext appContext = 
		SpringApplication.run(TestoxApplication.class, args);
		QuestionOperation questionOp = appContext.getBean(QuestionOperation.class);
		System.out.println(questionOp.getQuestion());
	}

}
