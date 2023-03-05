package com.ecom.ecomspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.ecomspringboot.entity.Cart;
import com.ecom.ecomspringboot.entity.User;

public interface CartRepository extends JpaRepository<Cart,Integer>
{
	List<Cart> findAll();
}
