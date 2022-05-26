package com.springaop.service;

public class PaymentServiceImpl implements PaymentService{		// We also make this class as @Component by making one class as @Configuration class, having @ComponentScan annotation as well. 

	public void makePayment(int amount) {
		
		//Payment code
		
		System.out.println(amount +" Amount Debited..");
		
		// ..some code.....
		
		System.out.println(amount +" Amount Credited..");
		
	}

}
