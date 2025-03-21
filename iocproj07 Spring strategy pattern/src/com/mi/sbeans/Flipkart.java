package com.mi.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fkt")
public final class Flipkart {

	@Autowired
	@Qualifier("dtdc")
	private Icourier courier;
	
	public Flipkart()
	{
		System.out.println("Flipkart :: 0-param Construction.");
	}

	public void setCourier(Icourier courier) {
		this.courier = courier;
	}
	
	public String Shopping(String items[], double price[])
	{
		System.out.println("Flipkart.Shopping()");
		
		double totalBill = 0.0;
		
		for (double d : price) {
			totalBill = totalBill + d;
		}
		
		int oid = new Random().nextInt(100000);
		
		String msg = courier.deliver(oid);
		
		return Arrays.toString(items)+" are shopped having bill amount :: "+totalBill+" --> "+msg;
	}
	
	
	
}
