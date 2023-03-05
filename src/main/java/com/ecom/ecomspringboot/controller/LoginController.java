package com.ecom.ecomspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.ecomspringboot.beans.UserBean;
import com.ecom.ecomspringboot.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	//@GetMapping("")
	
	
	@PostMapping("/user/signin")
	public String userValidLogin(@RequestBody UserBean userBean)
    {
    	return loginService.userlogin(userBean);
    	
    }
}
