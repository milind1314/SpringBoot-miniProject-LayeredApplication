package com.mi.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mi.config.AppConfig;
import com.mi.sbeans.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Flipkart flip = ctx.getBean("fkt",Flipkart.class);
		
		String result = flip.Shopping(new String[] {"Shirt", "Trouser"},new double[] {9000.0,5000.0});
		
		System.out.println(result);
		ctx.close();
	}

}
