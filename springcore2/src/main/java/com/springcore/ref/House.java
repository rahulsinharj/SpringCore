package com.springcore.ref;

public class House {
	
	private int door ;
	private Chair chair;
	
	public House() {
		super();
	}
	public House(int door, Chair chair) {
		super();
		this.door = door;
		this.chair = chair;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public Chair getChair() {
		return chair;
	}
	public void setChair(Chair chair) {
		this.chair = chair;
	}
	@Override
	public String toString() {
		return "House [door=" + door + ", chair=" + chair + "]";
	}
	
	
	
	
}
