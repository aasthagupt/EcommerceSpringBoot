package com.ecom.ecomspringboot.beans;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AddToCartBean {
	
	private int id;
	
	@Column(nullable=false)
	private Long product_id;
	
	@Column(nullable=false)
	private int quantity;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = (long) product_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
