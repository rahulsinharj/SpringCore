package com.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.service.PaymentService;

public class App
{
	public static void main(String[] args) 
	{
//		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springaop/config.xml");

		PaymentService paymentObj = context.getBean("payment", PaymentService.class);

		paymentObj.makePayment(599);

	}
}
