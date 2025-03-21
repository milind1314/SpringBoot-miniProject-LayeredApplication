package com.mi.cnfig;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.mi.sbeans")
public class AppConfig {
	/*
	@Bean("car")
	public CarService car()
	{
		return new CarService();
	}
	
	*/

}
