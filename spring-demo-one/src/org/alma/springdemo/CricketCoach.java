package org.alma.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String emailAdress;
	private String team;
	
	public CricketCoach() {
		super();
		System.out.println("Cricket : inside no arg constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Va picoler au pub";
	}

	@Override
	public String getDailyFortune() {
		return "Noooon " + this.fortuneService.getFortune();
	}


	public void setEmailAdress(String emailAdress) {
		System.out.println("CricketCoah : setemailAdress " + emailAdress);
		this.emailAdress = emailAdress;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method of cricket setter");
		this.fortuneService = fortuneService;
	}

}
