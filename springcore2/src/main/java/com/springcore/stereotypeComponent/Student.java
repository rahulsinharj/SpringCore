package com.springcore.stereotypeComponent;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component		kewal ye bhi likh skte hai, Yana pe @Component() ke brackets me if we don't write "stu" or "stu1" then byDefault camelCase "student" naam se obj se bana dega; 

@Component("stu")				//	This annotation is just equivalent to declaring BEAN in config file ; @Component tag ke karan com.springcore.stereotypeComponent pkg ke andar jis class ke andar ye tag milega uska obj create karega on runtime
@Scope("prototype")				// 	By default we have scope as "singleton" {i.e, providing same obj everytime for a new obj call} ; now if we want to get everytime a new obj whenever call for a new obj => just change the scope to "prototype" => that's it
public class Student {
	
/*	Both should be inside @Component annotated class.
  
  	// Singleton: Only one instance will be created for a single bean definition per Spring IoC container and the same object will be shared for each request made for that bean. Aur iss "singleton" scope ke karan obj zarur banega hi, agar hmne obj bean call nhi bhi kiya ho to bhi (context.getbean karke).
	// Prototype: A new instance will be created for a single bean definition every time a request is made for that bean.  Aur iss "prototype" scope ke karan obj ab obj banega jab hum obj ko call karege (context.getbean karke), agar nhi call karege to obj bhi nhi banega.
*/
	
	@Value("RahulSinha")			// These are Stereotype annotation
	private String studentName;
	
	@Value("Patna")
	private String city;
	
										// Basically this #{expression} is Spring Expression Language which accepts- classes, variables, methods, constructors, objects, and symbols - like char, numerics, operators, keywords, special symbols which return a value.
										// Injecting "standalone" collection from config.xml file -> into @Value("#{ }") SP Exp Lang 
	@Value("#{cityList}")				// #{cityList} ko SpringContainer config file se dhund lega, wo sari values ko list me convert karke , uska obj banake "address" reference me daal dega through @value("#{ }") 
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
