package com.example.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CreditCardAccImpl implements AccRepo {
	public String deposit(float amt) {
		return "Amt of "+amt+" CREDITED IN UR CREDIT CARD ACC";
	}

}
