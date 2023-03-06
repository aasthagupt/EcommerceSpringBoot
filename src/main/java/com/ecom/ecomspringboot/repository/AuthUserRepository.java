package com.ecom.ecomspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.ecomspringboot.entity.AuthUser;

@Repository
public interface AuthUserRepository extends JpaRepository<AuthUser,Integer>{

}
