package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DieselEngine implements Engine {

	public DieselEngine() {
		System.out.println("DieselEngine :: 0-param constructor");	
	}

	@Override
	public void start() {
		System.out.println("Diesel Engine is started");
	}

	@Override
	public void stop() {
		System.out.println("Diesel Engine is stopped");
	}

}
