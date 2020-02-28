package org.alma.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Travaille ton pied gauche ";
	}

}
