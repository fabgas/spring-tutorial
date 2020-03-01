package org.alma.spring.annotations.config;

public class BadFortune implements FortuneI {

	@Override
	public String getDailyFortune() {
		return "Rain, storm , bad days";
	}

}
