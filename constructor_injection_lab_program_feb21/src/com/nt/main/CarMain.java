package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.Driver;

public class CarMain {

	public static void main(String[] args) {
		
		//FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cnfg/applicationContext.xml");
		
		//Driver d = ctx.getBean("driver",Driver.class);
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("src/com/nt/cnfg/applicationContext.xml");
		//Driver driver = (Driver)ctx.getBean("driver", Driver.class);
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cnfg/applicationContext.xml");
		Driver driver = (Driver)ctx.getBean("driver", Driver.class);
		driver.drive();
		
		

	}

}
