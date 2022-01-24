package com.springcore.stereotypeComponent;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// @Component		kewal ye bhi likh skte hai, Yana pe if we don't write "stu1" then byDefault camelCase "student" naam se obj se bana dega; 

@Component("stu1")			//	These are Stereotype annotation ; @Component tag ke karan com.springcore.stereotypeComponent pkg ke andar jis class ke andar ye tag milega uska obj create karega on runtime
public class Student {

	
	@Value("RahulSinha")			// These are Stereotype annotation
	private String studentName;
	
	@Value("Patna")
	private String city;
	
	@Value("#{cityList}")				// "cityList" ko springcontainer config file se dhund lega, wo sari values ko list me convert karke , uska obj banake "address" reference me daal dega. 
	private List<String> address;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", address=" + address + "]";
	}
	
	
}
