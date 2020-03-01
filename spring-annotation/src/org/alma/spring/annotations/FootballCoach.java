package org.alma.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
	
	FortuneService fortuneService;
	
	@Autowired
	
	public FootballCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Travaille ton pied gauche ";
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
