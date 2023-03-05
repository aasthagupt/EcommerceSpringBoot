package com.ecom.ecomspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.ecomspringboot.beans.ProductBean;
import com.ecom.ecomspringboot.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{

	Product save(ProductBean productBean);
	

}
