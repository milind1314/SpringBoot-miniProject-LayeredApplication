package com.mi.comp;

public class FlightTransportation implements Transportation{
	
	@Override
	public void bookTrip(String destination, double price) {

		System.out.println("Booked a trip to "+destination+" by Flight for "+price+" .");
	}

}
