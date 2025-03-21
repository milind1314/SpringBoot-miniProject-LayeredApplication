package com.mi.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mi.cnfig.AppConfig;
import com.mi.sbeans.ServiceCenter;

public class ServiceCenterMain {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Object bean = ctx.getBean("service");
		ServiceCenter service =  (ServiceCenter) bean;
		service.service();
		ctx.close();
	}
}
