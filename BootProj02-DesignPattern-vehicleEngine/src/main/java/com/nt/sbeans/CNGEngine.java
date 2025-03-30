package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("cEngine")
public class CNGEngine implements Engine {

	
	public CNGEngine() {
		System.out.println("CNGEngine :: 0-param constructor");
	}

	@Override
	public void start() {
		System.out.println("CNG Engine is stopped");

	}

	@Override
	public void stop() {
		System.out.println("CNG Engine is stopped");

	}

}
