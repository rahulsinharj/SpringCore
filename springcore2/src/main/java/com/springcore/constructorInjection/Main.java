package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorInjection/constructorConfig.xml");
		
		Person p1 = (Person) context.getBean("person1");
		System.out.println(p1);
	
		Addition add = (Addition) context.getBean("add");
		add.doSum();
		
	}

} 
