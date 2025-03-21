package com.mi.sbeans;

import org.springframework.stereotype.Component;

@Component("car")
public class CarService implements VehicleService {

	@Override
	public void performService() {
		System.out.println("Car service is going on.");
	}

}



/*
 package com.mi.sbeans;


public class CarService implements VehicleService {

	@Override
	public void performService() {
		System.out.println("Car service is going on.");
	}

}
 */