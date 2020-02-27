package org.alma.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retreive the ben from bean container
		Coach theCoah = context.getBean("myCoach",Coach.class);
		CricketCoach theCoahCricket = context.getBean("myCricketCoach",CricketCoach.class);

		// calls methods on the bean
		System.out.println(theCoah.getDailyWorkout());
		System.out.println(theCoah.getDailyFortune());
		System.out.println(theCoahCricket.getDailyFortune());
		System.out.println(theCoahCricket.getEmailAdress());
		System.out.println(theCoahCricket.getTeam());
		//close the context
		context.close();
	}

}
