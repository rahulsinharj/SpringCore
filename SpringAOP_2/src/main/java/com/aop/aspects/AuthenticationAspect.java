package com.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect 
{
	// We now need to define out POINT CUTS :: so that aap POINT CUT pe jobhi execution class define kar do, aur baar baar bas uski ko use kar lo
	
	@Pointcut("within(com.aop.service.ShoppingCart)")									// within() will define with which particular "TYPE of CLASS" you want to execute the POINT CUTS methods. 
	public void authenticatingPointCut() { }
	
	@Pointcut("within(com.aop.service..*)")												// PointCut expression
	public void authorizationPointCut() { }
	
//	@Pointcut("within(com.aop.service..*)")												// PointCut expression
//	@Pointcut("execution(* com.aop.service.ShoppingCart.addAddressDetails(..))")
//	@Pointcut("execution(* com.aop.service.*.*(..))")
//	@Pointcut("execution(* com.aop.service.ShoppingCart.*(..))")
	@Pointcut("execution(* com.aop.service.*.addAddressDetails(..))")
	public void addressPointCut() { }
	
	
	
	// Advise - before/after  :: joki batata hai ki kin JoinPoints pe uss particular Advise ko execute karao.
	@Before("authenticatingPointCut() && authorizationPointCut()")				// you can write here pointcut for "addressPointCut()"
	public void authenticateCheck()
	{
		System.out.println("Implementing 'BEFORE' AuthenticateCheck PointCUT of AuthenticationAspect !");
	}
	
	
	
	
	
}
