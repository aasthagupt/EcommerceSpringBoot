package com.ecom.ecomspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.ecomspringboot.entity.User1;

@Repository
public interface UserRepository1 extends JpaRepository<User1,Integer>{
	User1 findByEmail(String email);

}
