package com.ecom.ecomspringboot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecom.ecomspringboot.beans.UserBean;
import com.ecom.ecomspringboot.entity.User;
import com.ecom.ecomspringboot.repository.UserRepository;

@Service
public class LoginService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public String userlogin(@RequestBody UserBean userBean) 
	{
		String incomingPassword =userBean.getPassword();
		User existingUser = userRepository.getByEmail(userBean.getEmail());
		
		if(existingUser.getPassword().equalsIgnoreCase(incomingPassword)) {
			return "VALID USER";
		} else {
			return "INVALID USER";
		}
		
		}
}
