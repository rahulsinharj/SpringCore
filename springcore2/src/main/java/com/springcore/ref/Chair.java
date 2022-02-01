package com.springcore.ref;

public class Chair {

	private int balls;

	public Chair() {
		super();
	}

	public Chair(int balls) {
		super();
		this.balls = balls;
	}

	public int getBalls() {
		return balls;
	}

	public void setBalls(int balls) {
		this.balls = balls;
	}

	@Override
	public String toString() {
		return "Chair [balls=" + balls + "]";
	}

	

	
}
