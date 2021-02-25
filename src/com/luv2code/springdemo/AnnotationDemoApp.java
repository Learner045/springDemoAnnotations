package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from container
		Coach tennisCoach = context.getBean("thatSillyCoach", Coach.class);
		
		//call methods
		System.out.println(tennisCoach.getDailyWorkout());
		
		//close
		context.close();
		
	}

}
