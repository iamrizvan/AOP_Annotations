package org.studyeasy.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Diagnose {

	@Before("run()")
	public void engine() {
		System.out.println("Before Advice");
	}
	
	@After("run()")
	public void engine1() {
		System.out.println("After Advice");
	}
	
	@Pointcut("execution(void org.studyeasy.cars.PetrolCar.run())")
	public void run() {	}
	
	@AfterReturning("run()")
	public void afterReturning() {
		System.out.println("After returning Advice");
	}
	
	
	@AfterThrowing("run()")
	public void afterThrowing() {
		System.out.println("After throwing Advice");
	}
	
}
