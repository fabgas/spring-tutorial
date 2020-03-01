package org.alma.spring.annotations.config;

public class SwinCoach implements CoachI {
	FortuneI fortune;
	
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
