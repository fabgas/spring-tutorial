package org.alma.spring.annotations.config;

import org.springframework.beans.factory.annotation.Value;

public class SwinCoach implements CoachI {
	FortuneI fortune;
	@Value("${foo.team}")
	String team;
	@Value("${foo.email}")
	String email;
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public SwinCoach(FortuneI fortune) {
		super();
		this.fortune = fortune;
	}

	@Override
	public String getDailywork() {
		return "got to water";
	}

	@Override
	public String getDailyFortune() {
		return this.fortune.getDailyFortune();
	}
	
}
