package com.ecom.ecomspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.ecomspringboot.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Integer>{

}
