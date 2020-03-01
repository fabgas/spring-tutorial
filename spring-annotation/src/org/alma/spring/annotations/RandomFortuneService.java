package org.alma.spring.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	String[] data = {"first random fortune", "second random fortune","thrid random fortune"};
	Random random = new Random();
	@Override
	public String getFortune() {
		int index = random.nextInt(3);
		return data[index];
	}

}
