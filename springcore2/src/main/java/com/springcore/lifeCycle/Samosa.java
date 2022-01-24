package com.springcore.lifeCycle;

public class Samosa {			// Calling INIT and DESTROY method of Samosa class ->  through xmlConfig

	private double price;

	public Samosa() {
		super();
	}

	public Samosa(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setter SAMOSA price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	
	public void init() {
		System.out.println("SAMOSA-INIT method called");
	}
	
	public void destroy() {
		System.out.println("SAMOSA-DESTROY method called");
	}
	
}