package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessegeGeneratorSetter;

public class WishMessage {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cnfg/applicationContext.xml");
		WishMessegeGeneratorSetter wish = ctx.getBean("wmgr", WishMessegeGeneratorSetter.class);
		System.out.println(wish.showMessege("Milind"));
		ctx.close();
		
	}
}
