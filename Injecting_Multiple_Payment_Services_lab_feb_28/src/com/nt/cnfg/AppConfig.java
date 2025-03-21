package com.nt.cnfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")
public class AppConfig {
	
	/*
	@Bean(name = "CreditCardService")
	public PaymentService creditCardPaymentService()
	{
		return creditCardPaymentService();
	}
	
	@Bean(name = "payPalService")
	public PaymentService payPalPaymentService()
	{
		return payPalPaymentService();
	}
	
	@Bean(name = "UPIservice")
	public PaymentService UPIPaymentservice()
	{
		return UPIPaymentservice();
	}
	*/
}
