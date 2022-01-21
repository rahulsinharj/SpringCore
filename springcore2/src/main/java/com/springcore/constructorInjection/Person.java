package com.springcore.constructorInjection;

public class Person {

	private String name;
	private int personId;
	private Certificate cname;
	
	public Person() {
		super();
	}

	public Person(String name, int personId, Certificate cname) {
		super();
		this.name = name;
		this.personId = personId;
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", cname=" + cname + "]";
	}

	
}