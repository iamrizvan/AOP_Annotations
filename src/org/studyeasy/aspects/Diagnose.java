package org.studyeasy.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.studyeasy.cars.PetrolCar;

@Aspect
public class Diagnose {

	
	@Before("execution(void run(int,int))")
	public void beforeAdvice(JoinPoint jp)
	{
	//	System.out.println(jp.toString());
		PetrolCar car = (PetrolCar) jp.getTarget();
		car.run("sexiest car ever");
		
		for(Object ob : jp.getArgs())
		{
			System.out.println("Passed parameter :" +ob);
		}
		System.out.println("Before advice message");
		
	}

	
}
