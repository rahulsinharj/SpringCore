package com.springcore.autowireByXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowireByXML/autoConfig.xml");

		Emp e1 = context.getBean("emp1",Emp.class);  // iss tarah bhi Emp me type cast kar skte ho.
		System.out.println(e1);
	}

}
