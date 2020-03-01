package org.alma.spring.annotations.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// initialisatise the configuration
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		CoachI coach = context.getBean("soccerCoach", CoachI.class);
		System.out.println(coach.getDailywork());
		CoachI swinCoach = context.getBean("swinCoach",CoachI.class);
		System.out.println(swinCoach.getDailyFortune());
		System.out.println(swinCoach.getDailywork());
		ComponentImpl impl = context.getBean(ComponentImpl.class);
		System.out.println(impl.getCoach().getDailyFortune());
		System.out.println(((SwinCoach)swinCoach).getEmail());
		System.out.println(((SwinCoach)swinCoach).getTeam());
		// close the configuration	
		context.close();
	}

}
