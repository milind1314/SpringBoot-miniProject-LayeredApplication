package com.mi.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("service")
public class ServiceCenter {

	@Autowired
	@Qualifier("car")
	private VehicleService vehicle;
	
	public void service() {
		vehicle.performService();
	}
	
}
