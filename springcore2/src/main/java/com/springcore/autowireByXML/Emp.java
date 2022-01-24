package com.springcore.autowireByXML;

public class Emp {

	private Address address;

	public Emp() {
		super();
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("EMP constructor called");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setting Address in EMP");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
}
