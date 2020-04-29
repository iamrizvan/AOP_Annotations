package org.studyeasy.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Diagnose {

	
//	@Pointcut("args(int,..)") list of arguments with wildcards
	@Pointcut("args(temp)")
	public void pointcut(int temp) {}
	
	@Before("pointcut(temp)")
	public void beforeAdvice(int temp)
	{
		System.out.println("Arguments value :" + temp);
	System.out.println("Before advice message");
		
	}

	
}
