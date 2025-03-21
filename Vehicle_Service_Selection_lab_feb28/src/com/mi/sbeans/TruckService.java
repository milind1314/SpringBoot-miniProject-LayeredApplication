package com.mi.sbeans;

import org.springframework.stereotype.Component;

@Component("truck")
public class TruckService implements VehicleService {

	@Override
	public void performService() {
		System.out.println("truck service is going on.");
	}

}
