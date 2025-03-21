package com.nt.sbeans;

import java.time.LocalDate;

public class TodaysDate {

	private LocalDate today;

	public LocalDate getToday() {
		return today;
	}

	public void setToday(LocalDate today) {
		this.today = today;
	}
	
	public void showDate()
	{
		System.out.println("Current Date : "+today);
		
	}
}
