package com.mi.comp;

public class TravelBooking {

	private Transportation transportation;

	
	
	public void setTransportation(Transportation transportation) {
		this.transportation = transportation;
	}



	public void executeBooking(String destination, double price)
	{
		System.out.println("Destination is :: "+destination);
		System.out.println("price is :: "+price);
		transportation.bookTrip(destination, price);
	}

	
	
}
