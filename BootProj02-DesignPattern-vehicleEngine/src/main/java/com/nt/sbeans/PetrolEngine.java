package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine implements Engine {

	public PetrolEngine() {
		System.out.println("PetrolEngine :: 0-param constructor");
	}

	@Override
	public void start() {
		System.out.println("Petrol Engine is started");
	}

	@Override
	public void stop() {
		System.out.println("Petrol Engine is stopped");
	}

}
