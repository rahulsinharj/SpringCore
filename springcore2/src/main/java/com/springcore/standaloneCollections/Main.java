package com.springcore.standaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standaloneCollections/aloneCollectionConfig.xml");

		Person p1 = (Person) context.getBean("person1");
		System.out.println(p1);
		
		System.out.println(p1.getFriends());
		System.out.println("Person.friends : "+p1.getFriends().getClass().getName());
		
		System.out.println("____________________________________________________");
		System.out.println(p1.getFeeStructure());
		System.out.println("Person.feeStructure : "+p1.getFeeStructure().getClass().getName());
		
		System.out.println("____________________________________________________");
		System.out.println(p1.getMyproperties());
		System.out.println("Person.myproperties : "+p1.getMyproperties().getClass().getName());
	}

}