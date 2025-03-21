package com.mi.factory;

import com.mi.comp.BusTransportation;
import com.mi.comp.FlightTransportation;
import com.mi.comp.TrainTransportation;
import com.mi.comp.Transportation;
import com.mi.comp.TravelBooking;

public class TransportationFactory {

	public static TravelBooking getInstance(String transportationType)
	{
		Transportation transportation = null;
		
		if (transportationType.equalsIgnoreCase("bus")) {
			transportation = new BusTransportation();
		}
		else if (transportationType.equalsIgnoreCase("train")) {
			transportation = new TrainTransportation();
		}
		else if (transportationType.equalsIgnoreCase("flight")) {
			transportation = new FlightTransportation();
		}
		else {
			throw new IllegalArgumentException("Invalid Transportation type...!");
		}
		
		TravelBooking travel = new TravelBooking();
		
		travel.setTransportation(transportation);		
		
		return travel;
	}
}
