package com.nt.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cnfg.AppConfig;
import com.nt.sbeans.CreditCardPaymentService;
import com.nt.sbeans.PayPalPaymentService;

public class MainClass {
public static void main(String[] args) {
	//FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cnfg/AppConfig");
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	CreditCardPaymentService pay=(CreditCardPaymentService)ctx.getBean("ccp");
	//PayPalPaymentService pay = (PayPalPaymentService) ctx.getBean("ccp");
	pay.processPayment(12000);
	ctx.close();
	
}
}
