package com.nt.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiscountCalculator {
	
	private LocalDate currentDate;
	private double price;
	
	public DiscountCalculator() {}
	
	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void calculateDiscount() {
		
		DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
		double discountedPrice = 0;
		
		if (dayOfWeek.toString().equalsIgnoreCase("saturday") || dayOfWeek.toString().equalsIgnoreCase("sunday")) {
			
			discountedPrice = price - (price * 0.2);
			
			System.out.println("Discount : "+(price * 0.2)+"Rs");
			System.out.println("Weekend Discount Applied! Discounted Price: "+discountedPrice);;
		}
		else {
			discountedPrice = price - (price * 0.1);
			System.out.println("Discount : "+(price * 0.1)+"Rs");
			System.out.println("Weekday Discount Applied! Discounted Price: "+discountedPrice);;
		}
		
	}

}
