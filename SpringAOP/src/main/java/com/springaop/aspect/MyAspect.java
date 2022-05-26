package com.springaop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	@Before("execution(* com.springaop.service.PaymentServiceImpl.makePayment(..))")		// * is the return type - accepting all return type, but we can use void, int in place of * 
	public void printBefore() 
	{
		System.out.println("MyAspect BEFORE_Payment activities are been executed !");
	}
	
	@After("execution(* com.springaop.service.PaymentServiceImpl.makePayment(..))")		// We have to put .. in makePayment() method , because this method in PaymentServiceImpl class is accepting parameters. 
	public void printAfter() 
	{
		System.out.println("MyAspect AFTER_Payment activities are been executed !");
	}
	
}
