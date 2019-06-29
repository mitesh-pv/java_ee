package com.spring.spring_getting_started_2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		Vehicle vehicleOne =new Bike();
		
		System.out.println(vehicleOne.getTotalDistanceTravelled());
		
	 	ClassPathXmlApplicationContext vehicleContext=new ClassPathXmlApplicationContext("applicationContext.xml");
	 	Vehicle vehicleTwo=vehicleContext.getBean("vehicle", Vehicle.class);
	 	
	 	System.out.println(vehicleTwo.getTotalDistanceTravelled());
		
	}
}
