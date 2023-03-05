package com.ecom.ecomspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.ecomspringboot.entity.Payment;
import com.ecom.ecomspringboot.repository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	PaymentRepository paymentRepository;
	    
	    public Payment processPayment(Payment payment) {
	    	Payment p = paymentRepository.save(payment);
			return p;
	    }
	}
