package com.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.service.PaymentService;

public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/springaop/config.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springaop/config.xml");
        
        PaymentService paymentObj = context.getBean("payment", PaymentService.class);
        
        paymentObj.makePayment(599);
        
        
        
        
        
        
        
    }
}
