package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {

	@Autowired
	@Qualifier("motor")
	private Engine engine;
	

	public Vehicle() {
		System.out.println("Vehicle:: 0-param constructor");
	}

	public void journey(String startPlace, String endPlace) {
		engine.start();
		System.out.println("Journey started from :: " + startPlace);

		System.out.println("Journey is going on...");

		engine.stop();
		System.out.println("Journey ended at :: " + endPlace);
	}

}
