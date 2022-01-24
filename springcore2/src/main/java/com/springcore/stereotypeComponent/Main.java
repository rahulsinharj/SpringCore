package com.springcore.stereotypeComponent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotypeComponent/stereoConfig.xml");
		
		Student s1 = (Student) con.getBean("stu1");
		System.out.println(s1);
		System.out.println(s1.getAddress());
		System.out.println(s1.getAddress().getClass().getName());
	}

}
