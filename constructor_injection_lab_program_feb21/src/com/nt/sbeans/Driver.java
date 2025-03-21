package com.nt.sbeans;

import com.nt.services.CarService;

public class Driver {

	private CarService carService;

	public Driver() {
		super();
	}

	public Driver(CarService carService) {
		this.carService = carService;
	}

	public void drive() {
		carService.startEngine();
		System.out.println("Driver is now Driving...");
	}

}
