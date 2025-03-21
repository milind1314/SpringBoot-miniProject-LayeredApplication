package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PaymentProcess {

	@Autowired
	@Qualifier("ccp")
	private PaymentService pay;
	
	public void option(double amt) {
		pay.processPayment(amt);
	}
}
