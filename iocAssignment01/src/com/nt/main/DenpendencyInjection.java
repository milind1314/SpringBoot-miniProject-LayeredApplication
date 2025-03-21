package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class DenpendencyInjection {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		SeasonFinder season = ctx.getBean("sg",SeasonFinder.class);
		
		String result = season.showSeason("milind");
		
		System.out.println("The Currunt Season is :: ( "+result+" )");
		
		ctx.close();
	}
}
