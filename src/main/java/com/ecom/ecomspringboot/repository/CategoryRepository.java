package com.ecom.ecomspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.ecomspringboot.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository <Category,Integer>{
}
