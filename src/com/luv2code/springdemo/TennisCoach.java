package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

	private FortuneService service;
	
	public TennisCoach() {
		
	}
	
	@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService fs) {
		service = fs;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand.";
	}

	@Override
	public String getDailyFortune() {
		return service.getFortune();
	}

	
}
