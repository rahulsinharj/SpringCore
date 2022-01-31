package com.springcore.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/javaConfig/config.xml"); 	// This will not be used for JavaConfig files
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);	// getting bean object through @Configuration annotation
		
		Student stu = (Student) context.getBean("firstStudent");		// getting bean obj through @ComponentScan and @Component { @ComponentScan must be in @Configuration annotated MyConfig class } and using @Autowired annotations
		stu.study();
		
		
		Teacher t = (Teacher) context.getBean("teacher1");			// getting bean obj through @Bean annotation in @Configuration annotated MyConfig class
		t.teach();
		
	}

}
