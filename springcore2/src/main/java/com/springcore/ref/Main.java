package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");

		House h1 = (House) context.getBean("houseRef");
		System.out.println(h1);
		
		System.out.println(h1.getDoor());
		System.out.println(h1.getChair());
		System.out.println(h1.getChair().getBalls());
		
		
		
	}

}
