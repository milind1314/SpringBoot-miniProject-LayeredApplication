package com.nt.main;


import java.util.Scanner;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.DiscountCalculator;

public class DependancyInjection {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cnfg/applicationContext.xml");
		DiscountCalculator calculator = ctx.getBean("dayOfWeek",DiscountCalculator.class);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Total Amount : ");
		double amt = sc.nextInt();
		
		
		calculator.setPrice(amt);
		
		calculator.calculateDiscount();
		
		sc.close();
		ctx.close();
	}
}
