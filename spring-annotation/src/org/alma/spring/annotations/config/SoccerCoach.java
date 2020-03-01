package org.alma.spring.annotations.config;

import org.springframework.stereotype.Component;

@Component("soccerCoach")
public class SoccerCoach implements CoachI{

	@Override
	public String getDailywork() {
		return "kick the ball";
	}

	@Override
	public String getDailyFortune() {
		return "Noops";
	}

}
