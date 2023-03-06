package com.ecom.ecomspringboot.exception;

public class AuthenticationFailException extends IllegalArgumentException{
	public AuthenticationFailException(String msg)
	{
		super(msg);
	}
}
