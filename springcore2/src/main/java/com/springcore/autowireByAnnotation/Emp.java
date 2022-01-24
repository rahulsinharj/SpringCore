package com.springcore.autowireByAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

// @Autowired will see ByType Annotation => It will check bean of Address type in config file.

public class Emp {

	@Autowired						// Autowiring/AutoInjection on Properties/instance_Variable	
	@Qualifier("address2")			// Qualifer isliye lagaye hai because @Autowired ke karan SpringContainer config file me "Address" type ka bean dhundega, agar same Address type ka multiple beans milega to confusion error aajayega.  
	private Address address;		// Jisko resolve karne ke liye Qualifier annotation lagayege hai {"address2" bean name ka}. "address2 wala bean ka obj aajayega Emp ke Address reference me.

	public Emp() {
		super();
	}
	
//	@Autowired						// Autowiring on Constructor
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("EMP constructor called");
	}

	public Address getAddress() {
		return address;
	}
	
//	@Autowired						// Autowiring on Setter method
	public void setAddress(Address address) {
		System.out.println("Setting Address in EMP");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
}
