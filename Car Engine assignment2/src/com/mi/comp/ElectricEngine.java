package com.mi.comp;

public final class ElectricEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("Electric Engine Has Started");
	}

	@Override
	public void endEngine() {
		System.out.println("Electric Engine Has Stopped");

	}

}
