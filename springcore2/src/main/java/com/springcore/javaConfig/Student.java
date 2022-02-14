package com.springcore.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("firstStudent")
public class Student {

	@Value("RahulSinha")
	private String studentName;
	
	@Value("105")
	private int rollNo;
	
	@Autowired								// kyuki Pencil class me @Component hai, to IOC uska obj bana dega ; aur iss @Autowired annotation ke karan uss Pencil class ka Bean obj iss "pencil" ke ref me khud hi autowire kar dega/ matlab automatically daal dega.
	private Pencil pencil;
	
	
	//@Autowired							// yaha pe direct "pencil" ke instance obj par @Autowired karke ke jagah , constructor pe hi @AutoWired kar sakte the.
	public Student(Pencil pencil) 
	{
		super();
		this.pencil = pencil;
	}

	public Student() {
		super();
	}


	public void study() {
		
		System.out.println("Student is studying book");
		
		this.pencil.showPencil();
	}

	@Override
	public String toString() {
		return "Student [studentName= " + studentName + ", rollNo= " + rollNo + ", pencil= " + pencil + "]";
	}
}
