package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngine")
public class ElectricEngine implements Engine {

	public ElectricEngine() {

		System.out.println("ElectricEngine :: 0-param constructor");
	}

	@Override
	public void start() {
		System.out.println("Electric Engine is stopped");

	}

	@Override
	public void stop() {
		System.out.println("Electric Engine is stopped");

	}

}
