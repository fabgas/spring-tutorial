package org.alma.spring.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.alma.spring.annotations.config")
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
