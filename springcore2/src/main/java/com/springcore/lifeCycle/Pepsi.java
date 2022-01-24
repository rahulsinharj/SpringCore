package com.springcore.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//Calling INIT and DESTROY method of Pepsi class ->  through Implementing InitializingBean,DisposableBean interfaces

public class Pepsi implements InitializingBean,DisposableBean {			
	private double price;

	public Pepsi() {
		super();
	}

	public Pepsi(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setter PEPSI price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {		// It will work as an INIT method
		
		System.out.println("PEPSI-INIT method called");
	}

	public void destroy() throws Exception {				// It will work as a DESTROY method
			
		System.out.println("PEPSI-DESTROY method called");		
	}
	
	
	
}
