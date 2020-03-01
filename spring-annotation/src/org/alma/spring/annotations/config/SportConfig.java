package org.alma.spring.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.alma.spring.annotations.config")
@PropertySource("classpath:ressources/sport.properties")
public class SportConfig {
		@Bean 
		public FortuneI badFortune() {
			FortuneI bad = new BadFortune();
			return bad;
		}
		@Bean
		public CoachI swinCoach() {
			SwinCoach mySwinCoach = new SwinCoach(badFortune());
			return mySwinCoach;
		}
}
