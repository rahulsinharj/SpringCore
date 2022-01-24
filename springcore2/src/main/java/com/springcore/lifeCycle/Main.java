package com.springcore.lifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifeCycle/lifecycleConfig.xml");
		context.registerShutdownHook();			// ye enabling of shutdownHook() method ApplicationContext ke paas nhi hai, uske ek parent interface AbstractApplicationContext ke paas hai.
		
		System.out.println("----------------------------------");
		
		Samosa s1 = (Samosa) context.getBean("samosa1");
		System.out.println(s1);
		
		System.out.println("----------------------------------");
		
		Pepsi p1 = (Pepsi) context.getBean("pepsi1");
		System.out.println(p1);
		
		System.out.println("----------------------------------");
		
		Book b1 = (Book) context.getBean("book1");
		System.out.println(b1);
		
		System.out.println("----------------------------------");
	}
}
