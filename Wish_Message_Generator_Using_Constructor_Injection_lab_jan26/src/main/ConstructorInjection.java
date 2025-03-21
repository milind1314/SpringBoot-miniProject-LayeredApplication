package main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import sbeans.WishMessageGenerator;

public class ConstructorInjection {

	
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/cnfg/AplicationContext.xml");
		WishMessageGenerator wmg = ctx.getBean("wish",WishMessageGenerator.class);
		
		wmg.showMessage();
		
		ctx.close();
	}
	
}
