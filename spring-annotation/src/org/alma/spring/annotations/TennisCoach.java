package org.alma.spring.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {
	FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">>tennisCoach : inside constructor");
	}
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	@Autowired
	@Qualifier("happyFortuneService")
	public void setMyCrazyFortuneService(FortuneService fortuneService) {
		System.out.println(">>tennisCoach : inside doSomeCrazy service");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Travaille ton revers ";
	}

	@Override
	public String getDailyFortune() {
		return getFortuneService().getFortune();
	}
	@PostConstruct
	private void doOnInit() {
		System.out.println("on init");
	}
	@PreDestroy
	public void onDestroy() {
		System.out.println("predestroy");
	}
}
