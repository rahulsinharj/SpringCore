package com.springcore.constructorInjection;

public class Certificate {

	private String cname;

	public Certificate() {
		super();
	}

	public Certificate(String cname) {
		super();
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Certificate [cname=" + cname + "]";
	}
	
	
}
