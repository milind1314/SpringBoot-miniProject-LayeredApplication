package com.mi.comp;

public class Vehicle {

	private IEngine engine;

	public IEngine getEngine() {
		return engine;
	}

	public void setEngine(IEngine engine) {
		System.out.println("Vehicle.setEngine()");
		this.engine = engine;
	}
	
	public void journey(String startPlace, String endPlace)
	{
		engine.startEngine();
		System.out.println("Journey started from :: "+startPlace);
		System.out.println();
		engine.endEngine();
		System.out.println("Journey ended at :: "+endPlace);
	}
	
}
