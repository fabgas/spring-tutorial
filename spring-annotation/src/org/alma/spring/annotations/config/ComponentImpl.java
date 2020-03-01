package org.alma.spring.annotations.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ComponentImpl {

	@Autowired
	@Qualifier("swinCoach")
	CoachI swinCoach;
	
	public CoachI getCoach() {
		return this.swinCoach;
	}
}	
