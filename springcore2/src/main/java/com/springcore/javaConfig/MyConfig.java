package com.springcore.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration													// @Configuration - se ye bata rahe hai ki ye class Java ki sari configurations handle kar rahi hai , whether it is BEAN-configuration, Component-Scan configuration 
@ComponentScan(basePackages = "com.springcore.javaConfig")		// @ComponentScan - takes the Base packages to scan for annotated components ; that means in which pkg to scan for the @Component annotations - for creating bean for those pkg classes.
public class MyConfig {

	// @Bean me name={""} lagane me jo bhi name me likhe hai uss name se hi obj ban jayege iss class ka , by IOC.
	@Bean(name= {"teacher1"})					// iss method ko hame annotate karna padega @Bean se, jisse ye returned obj chala jayega IOC ke pas, tabhi IOC container samajh payega ki hame isse return kiya hua obj ko oosse lena hai , jo ki wo obj osse koi maang sakega.
	public Teacher getTeacherObj() 				// ye obj Teacher class ka obj hi return karega.
	{	
		// creating a new obj of Teacher class
		Teacher teacher = new Teacher(getPenObj());
		
		return teacher;
	}
	
	@Bean									// @Bean wale class me other koi bhi annotation ka use nhi padta hai, neither @ComponentScan, not @Component on that Teacher/Pen class
	public Pen getPenObj()
	{
		return new Pen();
	}
}



/*
 [1st Method for getting bean obj] - through config.xml <bean> tag
 
 [2nd Method for getting bean obj] - through @Component annotation tag in that class whose Bean obj you want.
 
 [3rd Method for getting bean obj] - through @Bean annotation tag in MyConfig class {MyConfig class means any class which has only @Configuration annotation ; waise @Bean ke liye @ComponentScan(basePackages = "") is not required }

*/