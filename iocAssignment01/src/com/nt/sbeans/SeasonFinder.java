package com.nt.sbeans;

import java.time.LocalDate;

public class SeasonFinder {
	
	private LocalDate month;

	public void setMonth(LocalDate month) {
		this.month = month;
	}
	
	public String showSeason(String user)
	{
		int mon = month.getMonthValue();
		
		if (mon < 4) {
			return "Summer";
		}
		if (mon < 8) {
			return "Rainy";
		}
		else {
			return "Winter";
		}
	}

}
