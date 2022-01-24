package com.springcore.autowireByAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowireByAnnotation/autoAnnoConfig.xml");

		Emp e1 = (Emp) context.getBean("emp1");
		System.out.println(e1);
	}

}
