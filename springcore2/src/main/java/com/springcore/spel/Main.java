package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelConfig.xml");
		
		Person p = (Person) context.getBean("person");
		System.out.println(p);
		
		System.out.println("-----------------------------------------------------------------");
		
		SpelExpressionParser sexp = new SpelExpressionParser();
		Expression parseExpression = sexp.parseExpression("10+15");
		System.out.println(parseExpression.getValue());
		
	
		
	}

}
