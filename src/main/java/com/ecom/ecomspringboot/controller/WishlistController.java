//package com.ecom.ecomspringboot.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.ecom.ecomspringboot.entity.Product;
//import com.ecom.ecomspringboot.entity.Wishlist;
//import com.ecom.ecomspringboot.service.WishlistService;
//
//@RestController
//
//public class WishlistController {
//	
//	@Autowired
//	WishlistService wishlistService;
//	
//	//@GetMapping("")
//	
//	@PostMapping("/user/Wishlist/add")
//	public ResponseEntity<String> addToWishlist(@RequestBody Product product) {
//		
//		Wishlist wishlist=new Wishlist(product);
//		wishlistService.createWishlist(wishlist);
//		return new ResponseEntity<>("Product added to Wishlist", HttpStatus.OK);
// 
//	}
//	
//
//}
