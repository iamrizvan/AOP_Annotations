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
	
	@Pointcut("execution(void org.studyeasy.cars.PetrolCar.run())")
	public void run() {	}
	
	@Around("run()")
	public void aroundAdvice(ProceedingJoinPoint jp)
	{
		System.out.println("Around advice intial message");
		
		try {
			jp.proceed();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Around advice later message");
	}
	
}
