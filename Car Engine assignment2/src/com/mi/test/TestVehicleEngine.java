package com.mi.test;

import com.mi.Factory.VehicleFactory;
import com.mi.comp.Vehicle;

public class TestVehicleEngine {

	public static void main(String[] args) {

		Vehicle fortuner = VehicleFactory.getInstance("petrol");
		fortuner.journey("Hyderabad", "Mumbai");
		
		System.out.println("--------------------------------");
		
		Vehicle thar = VehicleFactory.getInstance("diesel");
		thar.journey("Mumbai","Goa");
		
		
	}

}
