package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("upi")
public class UPIPaymentService implements PaymentService {

	@Override
	public void processPayment(double amount) {

		System.out.println("Paying by UPI : "+amount);
	}

}
