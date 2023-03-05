package com.ecom.ecomspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.ecomspringboot.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	
	public User getByEmail(String email);


}
