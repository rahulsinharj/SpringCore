package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.config.BeanConfig;
import com.aop.service.ShoppingCart;

public class Main 
{
    public static void main( String[] args )
    {
//        System.out.println( "AOP Application running !" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        
        ShoppingCart cart = context.getBean(ShoppingCart.class);
        cart.checkout(5);
        cart.addAddressDetails();
    
    
    }
}
