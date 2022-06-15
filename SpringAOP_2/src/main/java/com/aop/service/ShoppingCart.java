package com.aop.service;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart 
{
	public void checkout(int n)			// This is the JOIN-POINT, where we will call out PointCuts methods.
	{
		/*	There are some cross cutting concerns , that we have to separate it out like , and we have to create is different Aspects :
		  	 - Logging  
		  	 - Authentication and Authorization
		  	 - Sanitize the data
		*/
		
		
		System.out.println("Checkout method from ShoppingCart called.. " +n +" items");
		
	}

}
