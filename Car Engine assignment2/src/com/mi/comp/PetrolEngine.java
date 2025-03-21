package com.mi.comp;

public final class PetrolEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("Petrol Engine Has Started");
		
	}

	@Override
	public void endEngine() {
		System.out.println("Petrol Engine Has Stopped");

	}

}
