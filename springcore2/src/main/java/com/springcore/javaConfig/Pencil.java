package com.springcore.javaConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pencil {

	@Value("4")
	private int pencilCount;
	
	public void showPencil() {
		System.out.println("Student Pencil is of brown color");
	}

	@Override
	public String toString() {
		return "Pencil [pencilCount= " + pencilCount + "]";
	}

	
}
