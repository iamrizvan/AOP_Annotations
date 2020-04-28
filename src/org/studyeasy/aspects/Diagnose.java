package org.studyeasy.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Diagnose {
	
//	@Pointcut("execution(* org.studyeasy.cars.PetrolCar.*(*,*))")
//	@Pointcut("execution(void org.studyeasy.cars.PetrolCar.run(*))")    // '*' wildcard is used for single parameter of any type
//	@Pointcut("execution(* org.studyeasy.cars.PetrolCar.run(..))")      // '*' wildcard is used for any type of return type method
	@Pointcut("execution(* org.studyeasy.cars.PetrolCar.run(..))")   // '..' wildcard is used for multiple parameter of any type
	public void run() {	}
	
	@Before("run()")
	public void beforeAdvice()
	{
		System.out.println("Before advice message");
		
	}
	

	@After("run()")
	public void afterAdvice()
	{
		System.out.println("After advice message");
		
	}
	
}
