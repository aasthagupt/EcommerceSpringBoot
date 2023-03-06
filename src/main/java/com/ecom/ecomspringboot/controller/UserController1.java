package com.ecom.ecomspringboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.ecomspringboot.beans.ResponseBean;
import com.ecom.ecomspringboot.beans.SignInBean;
import com.ecom.ecomspringboot.beans.SignupBean;
import com.ecom.ecomspringboot.entity.User1;
import com.ecom.ecomspringboot.service.UserService1;

@RestController
public class UserController1 {
	
	@Autowired
	UserService1 userService;
	
	 
	
	@PostMapping("/signup")
	public ResponseBean signup(@RequestBody SignupBean signupBean)
	{
		return userService.signUp(signupBean);
	}
	
	@PostMapping("/signIn")
	public String signIn(@RequestBody SignInBean signInBean)
	{
		return userService.signIn(signInBean);
	}
	
	@GetMapping("/user/get")
	public List<User1> getUser()
	{
		return userService.getAllUser();		
	}
	
	@GetMapping("/user/get/{id}")
	public Optional<User1> getUserById(int id)
	{
		return userService.getUserById(id);
		
	}
	
}
