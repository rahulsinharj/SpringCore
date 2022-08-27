package com.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.aop")
@EnableAspectJAutoProxy
public class BeanConfig 
{
	
}


/* @EnableAspectJAutoProxy => Enables support for handling components marked with AspectJ's @Aspect annotation, 
								similar to functionality found in Spring's <aop:aspectj-autoproxy> XML element. 
								To be used on @Configuration classes.
*/