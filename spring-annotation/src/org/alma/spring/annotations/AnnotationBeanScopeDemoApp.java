package org.alma.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retreive the bean from bean container
		Coach theCoah = context.getBean("thatSillyCoach",Coach.class);
		Coach theCoah2 = context.getBean("thatSillyCoach",Coach.class);
				
		boolean result = (theCoah == theCoah2);
				// calls methods on the bean
		System.out.println("\n same instance :" + result);
		System.out.println("\n memory for thecoach : " + theCoah);
		System.out.println("\n memory for thecoach : " + theCoah2);
				
				//close the context
		context.close();

	}

}
