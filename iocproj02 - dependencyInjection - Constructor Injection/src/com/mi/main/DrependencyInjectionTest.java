package com.mi.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.mi.sbeans.WishMessegeGenerator;

public class DrependencyInjectionTest {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/mi/cnfg/applicationContext.xml");
		WishMessegeGenerator wish = ctx.getBean("wmgs",WishMessegeGenerator.class);
		String Result = wish.showWishmessege("maddy");
		System.out.println(Result);
		ctx.close();
		
	}

}
