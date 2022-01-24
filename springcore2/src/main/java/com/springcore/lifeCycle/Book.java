package com.springcore.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//Calling INIT and DESTROY method of Book class ->  through @PostConstruct , @PreDestroy annotations 

public class Book {

	private String subject;

	public Book() {
		super();
	}

	public Book(String subject) {
		super();
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Book [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("BOOK-INIT method called");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("BOOK-DESTROY method called");
	}

}

