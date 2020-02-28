package org.alma.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("thatSillyCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		Coach coachFootball = context.getBean("footballCoach", Coach.class);
		System.out.println(coachFootball.getDailyWorkout());
		context.close();

	}

}
