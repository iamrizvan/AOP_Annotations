package org.studyeasy.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.config.MyConfig;
import org.studyeasy.service.Cars;


public class App {

	public static void main(String[] args) {
     
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Cars cars = context.getBean("cars", Cars.class);
		try {
			cars.getPetrolCar().run(100,5);
			context.close();
		} catch (Exception e) {
			System.out.println("Cought Exception "+ e.getMessage());
			context.close();
		}
		
	}
	

}
