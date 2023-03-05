package com.ecom.ecomspringboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.ecomspringboot.beans.AddToCartBean;
import com.ecom.ecomspringboot.beans.CartBean;
import com.ecom.ecomspringboot.service.CartService;

@RestController
public class CartController {
	
	@Autowired
	private CartService cartService;
//	@Autowired
//	CartBean cartBean;
	
	@GetMapping("/cart/get")
	public ResponseEntity<CartBean> getCartitems(){
		CartBean cartBean = cartService.listCartItems();
		return new ResponseEntity<>(cartBean,HttpStatus.OK);		 
	}
	
	@PostMapping("/cart/add")
	public ResponseEntity<String> addToCart(@RequestBody AddToCartBean addToCartBean)
	{
		cartService.addToCart(addToCartBean);
		return new ResponseEntity<>("Product added to cart", HttpStatus.CREATED);
	}
	
	
	
}
