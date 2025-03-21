package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.TodaysDate;


public class DenpendencyInjection {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cnfg/applicationContext.xml");
		TodaysDate date = (TodaysDate) ctx.getBean("datePrinter",TodaysDate.class);
		date.showDate();
		ctx.close();
	}
	
}
