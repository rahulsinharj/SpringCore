package com.springcore.stereotypeComponent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotypeComponent/stereoConfig.xml");
		
		Student s1 = (Student) con.getBean("stu");
		System.out.println(s1);
		System.out.println(s1.getAddress());
		System.out.println(s1.getAddress().getClass().getName());
		
		System.out.println("______________Space for checking scope as SINGLETON / PROTOTYPE :______________");	
	
		System.out.println("stu obj1 "+s1.hashCode());
		
		Student s2 = (Student) con.getBean("stu");
		System.out.println("stu obj2 "+s2.hashCode());
		
		System.out.println("_____________________________");
		Teacher t1 = (Teacher) con.getBean("teacher");
		Teacher t2 = (Teacher) con.getBean("teacher");
		System.out.println("teacher obj1 "+t1.hashCode());
		System.out.println("teacher obj2 "+t2.hashCode());
	}

}
