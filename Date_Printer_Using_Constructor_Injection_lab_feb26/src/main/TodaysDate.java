package main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import sbeans.DatePrinter;

public class TodaysDate {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/cnfg/applicationContext.xml");
		DatePrinter dp = ctx.getBean("today",DatePrinter.class);
		
		dp.printDate();
		ctx.close();
	}
}
