package com.springcore.javaConfig;

public class Teacher {

	private Pen pen;
	
	
	public Teacher(Pen pen) {
		super();
		this.pen = pen;
	}


	public Teacher() {
		super();
	}


	public void teach() {
		
		System.out.println("Teacher is teaching Science");
		
		this.pen.showPen();
	}
}
