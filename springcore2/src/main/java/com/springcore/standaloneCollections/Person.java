package com.springcore.standaloneCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

	private List<String> friends;
	private Map<String, Integer> feeStructure;
	private Properties myproperties;
	
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}
	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}
	public Properties getMyproperties() {
		return myproperties;
	}
	public void setMyproperties(Properties myproperties) {
		this.myproperties = myproperties;
	}
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feeStructure=" + feeStructure + ", myproperties=" + myproperties + "]";
	}
	

	
	
	
}
