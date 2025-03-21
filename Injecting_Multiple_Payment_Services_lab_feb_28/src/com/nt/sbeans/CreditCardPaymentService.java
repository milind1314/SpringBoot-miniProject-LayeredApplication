package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("ccp")
public class CreditCardPaymentService implements PaymentService {

	@Override
	public void processPayment(double amount) {
		System.out.println("Paying by Credit Card : "+amount);
	}

}
