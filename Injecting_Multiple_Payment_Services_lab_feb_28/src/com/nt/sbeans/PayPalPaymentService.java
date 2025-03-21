package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("ppp")
public class PayPalPaymentService implements PaymentService {

	@Override
	public void processPayment(double amount) {

		System.out.println("Paying by PayPal : "+amount);
	}

}
