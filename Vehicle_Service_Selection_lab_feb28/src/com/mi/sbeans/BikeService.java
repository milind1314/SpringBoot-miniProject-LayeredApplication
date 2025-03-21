package com.mi.sbeans;

import org.springframework.stereotype.Component;

@Component("bike")
public class BikeService implements VehicleService {

	@Override
	public void performService() {
		System.out.println("Bike service is going on.");
	}

}
