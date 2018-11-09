package com.java.generic;
import java.util.ArrayList;
import java.util.Map;

import com.java.generic.GenericCar;

public class CarImplementation<T>{

	

	public static void main(String[] args) {
		ArrayList<GenericCar> car = new ArrayList<GenericCar>();
		car.add(new GenericCar<String>("Honda", "CRV", "4 wheels", " 4 roll Seat"));
		//car.get(1);
		
		System.out.println(car);
		System.out.println(car.get(0));
		
		
		

	}

}
