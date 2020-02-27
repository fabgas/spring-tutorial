package org.alma.springdemo;

public class MyApp {

	public static void main(String[] args) {
		//create the object
		Coach theCoach = new BaseballCoach(new HappyFortuneService());
		Coach trackCoach = new TrackCoach(new HappyFortuneService());
		//use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
