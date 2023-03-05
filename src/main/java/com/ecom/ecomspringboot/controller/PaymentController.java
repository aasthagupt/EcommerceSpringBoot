package com.ecom.ecomspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.ecomspringboot.entity.Payment;
import com.ecom.ecomspringboot.service.PaymentService;

@RestController
public class PaymentController {
	    
	    @Autowired
	    private PaymentService paymentService;

	    @PostMapping("/payment")
	    public ResponseEntity<String> processPayment(@RequestBody Payment payment) {
	    	
	    	paymentService.processPayment(payment);
	    	return new ResponseEntity<>("payment successfull",HttpStatus.OK);
	    	
	        
	    }
	    
	    
	}

	

