package com.mi.test;

import com.mi.comp.TravelBooking;
import com.mi.factory.TransportationFactory;

public class TestTravelBookingMain {

	public static void main(String[] args) {
		TravelBooking travel = TransportationFactory.getInstance("train");
		
		travel.executeBooking("Hyderabad", 395.0);
		
		
		}
}
