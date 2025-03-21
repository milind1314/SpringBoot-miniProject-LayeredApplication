package com.mi.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessegeGenerator {

	private LocalTime time;
	private LocalDate date;
	private String name;
	
	public WishMessegeGenerator(LocalTime time, LocalDate date, String name) {
		super();
		this.time = time;
		this.date = date;
		this.name = name;
		
		System.out.println("WishMessegeGenerator.WishMessegeGenerator()");
	}

//	public LocalTime getTime() {
//		System.out.println("WishMessegeGenerator.getTime()");
//		return time;
//	}
//
//	public LocalDate getDate() {
//		System.out.println("WishMessegeGenerator.getDate()");
//		return date;
//	}
//
	public String getName() {
		System.out.println("WishMessegeGenerator.getName()");
		return name;
	}
	
	
	public String showWishmessege(String name) {
		System.out.println("WishMessegeGenerator.showWishmessege()"+date+"........"+time+".........."+name);	
		
		int hour = time.getHour();
		
		if (hour < 12) {
			return "Good Morning :: "+name;
		}
		else if (hour < 16) {
			return "Good Afternoon :: "+name;
		}
		else if (hour < 20) {
			return "Good Evening :: "+name;
		}
		else {
			return "Good Night :: "+name;
		}
	}
	
	
	
	
}
