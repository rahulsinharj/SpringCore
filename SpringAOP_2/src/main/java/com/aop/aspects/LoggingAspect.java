package com.aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect 			// Each PointCut will have it own separate Class
{			

	// Here we have to define the pointcuts . Means logger() is that what we have to run, now we will define where we have to run.  
	
	@Before("execution(* com.aop.service.ShoppingCart.checkout(..))")
	public void beforeLogger()
	{
		System.out.println("Implementing 'BEFORE' Logger ASPECTS !");
	}
	
//	@After("execution(* *.*.*.*.checkout(..))")
	@After("execution(* com.aop.service.ShoppingCart.checkout(..))")
	public void afterLogger()
	{
		System.out.println("Implementing 'AFTER' Logger ASPECTS !");
	}
	
} 
