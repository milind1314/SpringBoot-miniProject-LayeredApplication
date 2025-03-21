package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.FlipKart;

public class FlipkartFactory {

	public static FlipKart getInstance (String courierType)
	{
		Courier courier;
		
		if (courierType.equalsIgnoreCase("dtdc")) {
			courier = new DTDC();
		}
		else if (courierType.equalsIgnoreCase("bluedart")) {
			courier = new BlueDart();
		}
		else {
			throw new IllegalArgumentException("Invalid Courier Type...!"+courierType);
		}
		
		FlipKart flkt = new FlipKart();
		
		flkt.setCourier(courier);
		
		return flkt;
	}
}
