package org.alma.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		//retreive the bean from bean container
		Coach theCoah = context.getBean("myCoach",Coach.class);
		Coach theCoah2 = context.getBean("myCoach",Coach.class);
		
		boolean result = (theCoah == theCoah2);
		// calls methods on the bean
		System.out.println("\n same instance :" + result);
		System.out.println("\n memory for thecoach : " + theCoah);
		System.out.println("\n memory for thecoach : " + theCoah2);
		
		//close the context
		context.close();
	}

}
