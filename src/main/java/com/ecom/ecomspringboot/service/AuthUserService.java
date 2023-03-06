package com.ecom.ecomspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.ecomspringboot.entity.AuthUser;
import com.ecom.ecomspringboot.repository.AuthUserRepository;

@Service
public class AuthUserService {
	
	@Autowired
	AuthUserRepository authUserRepository;

	public void saveConfirmationToken(AuthUser authUser) {
		authUserRepository.save(authUser);
	}
	

}
