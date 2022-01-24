package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Hello springcore.collections !");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionConfig.xml");
		
		Emp e1 = (Emp) context.getBean("emp1");
		System.out.println(e1);
		
//		System.out.println(e1.getName());
//		System.out.println(e1.getPhones());
//		System.out.println(e1.getAddress());
//		System.out.println(e1.getCourses());
		
		System.out.println("Phone : "+e1.getPhones().getClass().getName());
		System.out.println("Address : "+e1.getAddress().getClass().getName());
		System.out.println("Courses : "+e1.getCourses().getClass().getName());
	
    }
}
