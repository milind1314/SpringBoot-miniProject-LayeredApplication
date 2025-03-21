package com.mi.Factory;

import com.mi.comp.DieselEngine;
import com.mi.comp.ElectricEngine;
import com.mi.comp.IEngine;
import com.mi.comp.PetrolEngine;
import com.mi.comp.Vehicle;

public class VehicleFactory {

	public static Vehicle getInstance(String engineType) {
		
		IEngine engine = null;
		
		if (engineType.equalsIgnoreCase("petrol")) {
			engine = new PetrolEngine();
		}
		else if (engineType.equalsIgnoreCase("diesel")) {
			engine = new DieselEngine();
		}
		else if (engineType.equalsIgnoreCase("electric")) {
			engine = new ElectricEngine();
		}
		else {
			throw new IllegalArgumentException("Invalid Engine Type...!");
		}
		
		Vehicle v = new Vehicle();
		v.setEngine(engine);
		
		return v;
		
	}
}
