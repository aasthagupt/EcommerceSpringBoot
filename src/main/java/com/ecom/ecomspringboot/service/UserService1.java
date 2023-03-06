package com.ecom.ecomspringboot.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.ecomspringboot.beans.ResponseBean;
import com.ecom.ecomspringboot.beans.SignInBean;
import com.ecom.ecomspringboot.beans.SignupBean;
import com.ecom.ecomspringboot.entity.User1;
import com.ecom.ecomspringboot.exception.AuthenticationFailException;
import com.ecom.ecomspringboot.exception.CustomException;
import com.ecom.ecomspringboot.repository.UserRepository1;

import jakarta.xml.bind.DatatypeConverter;

@Service
public class UserService1 {
	
	@Autowired
	UserRepository1 userRepository1;
	@Autowired 
	AuthUserService authUserService;
		
	
	public ResponseBean signUp(SignupBean signupBean)
	{
		if(Objects.nonNull(userRepository1.findByEmail(signupBean.getEmail())))
		{
			throw new CustomException("user emailId already present");
		}
		
		
		String encryptedPassword=signupBean.getPassword();
		
		try {
			encryptedPassword=encryptPassword(signupBean.getPassword());
		}catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		User1 user=new User1(signupBean.getFirstName(),signupBean.getLastname(),signupBean.getEmail(),encryptedPassword);
		userRepository1.save(user);
		
//		final AuthUser authUser=new AuthUser(user);
//		authUserService.saveConfirmationToken(authUser);
		 
		
		ResponseBean responseBean=new ResponseBean();
		return responseBean;
	}
	
	
	
	
	private String encryptPassword(String password) throws NoSuchAlgorithmException
	{
		MessageDigest md=MessageDigest.getInstance("MD5");
		md.update(password.getBytes());
		byte[] digest=md.digest();
		String hash=DatatypeConverter.printHexBinary(digest).toUpperCase();
		
		return hash;
	}
	
	

	public String signIn(SignInBean signInBean) {
		
		User1 user=userRepository1.findByEmail(signInBean.getEmail());
		if(Objects.isNull(user))
		{
			throw new AuthenticationFailException("user not valid");
		}
		try {
			if(!user.getPassword().equals(encryptPassword(signInBean.getPassword())))
				throw new AuthenticationFailException("wrong password");
			
		}catch(NoSuchAlgorithmException e)
		{
			e.printStackTrace();
		}
		return "login successfull";
	}




	public List<User1> getAllUser() {
		return userRepository1.findAll();
	}
	
	public Optional<User1> getUserById(int id) {
		return userRepository1.findById(id);
	}
	
	

}
