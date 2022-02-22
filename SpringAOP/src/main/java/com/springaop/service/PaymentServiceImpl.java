package com.springaop.service;

public class PaymentServiceImpl implements PaymentService{

	public void makePayment(int amount) {
		
		//Payment code
		
		System.out.println(amount +" Amount Debited..");
		
		// ..some code.....
		
		System.out.println(amount +" Amount Credited..");
		
	}

}
