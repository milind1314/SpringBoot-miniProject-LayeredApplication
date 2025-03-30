package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {

	public SeasonFinder() {
		super();
		System.out.println("SeasonFinder.DefaultConstructor()");
	}

	@Autowired
	private LocalDate date;

	public String findSeason() {
		int month = date.getMonthValue();

		if (month >= 3 && month <= 7) {
			return "Summer";
		} else if (month > 7 && month <= 10) {
			return "Rainy";
		} else {
			return "Winter";
		}
	}
}
