package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	// Basically this #{expression} is Spring Expression Language which accepts- classes, variables, methods, constructors, objects, and symbols - like char, numerics, operators, keywords, special symbols which return a value.
	
	@Value("#{2+5}")
	private int x;
	
	
	@Value("#{2+3+5+5}")	
	private int y;
	
	@Value("#{ T(java.lang.Math).sqrt(144) }")
	private double z;

	@Value("#{T(java.lang.Math).PI }")
	private double pi;
	
	@Value("#{new java.lang.String('RahulSinha') }")
	private String name;

	@Value("#{8-4>3 }")
	private boolean isCorrect;			// byDefault it is "false"
	
	
	

	
	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Person [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", name=" + name + ", isCorrect=" + isCorrect
				+ "]";
	}

	
	
	
	
}
