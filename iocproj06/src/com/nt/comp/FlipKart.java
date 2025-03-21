package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public final class FlipKart {

	private Courier courier;
	
	public void setCourier(Courier courier)
	{
		System.out.println("FlipKart.setCourier()");
		this.courier = courier;
	}
	
	public String shopping(String items[],double price[])
	{
		double billAmount = 0.0;
		for (double d : price) {
			billAmount = billAmount + d;
		}
		
		int oid = new Random().nextInt(10000);
		
		String msg = courier.delivery(oid);
		
		return Arrays.toString(items)+"items with bill amount ::: "+billAmount+" ---- "+msg;
		
	}
}
