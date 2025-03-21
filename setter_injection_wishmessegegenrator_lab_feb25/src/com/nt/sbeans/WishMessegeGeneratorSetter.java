package com.nt.sbeans;

import java.time.LocalTime;

public class WishMessegeGeneratorSetter {

	private LocalTime time;

	public void setTime(LocalTime time) {
		this.time = time;
	}
	
	public String showMessege( String user) {
		
		int hour = time.getHour();
		if (hour < 12) {
			return"Good Morning "+user;
		}
		else if (hour >= 12 && hour < 18) {
			return"Good Afternoon "+user;
		}
		else {
			return"Good Evening "+user;
		}
	}
}
