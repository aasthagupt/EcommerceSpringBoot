package com.ecom.ecomspringboot.beans;

import com.ecom.ecomspringboot.entity.Cart;
import com.ecom.ecomspringboot.entity.Product;

public class CartItemBean {
	private int id;
	private int qty;
	private Product product;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public CartItemBean(int id, int qty, Product product) {
		super();
		this.id = id;
		this.qty = qty;
		this.product = product;
	}
	public CartItemBean(Cart cart) {
		this.id=cart.getId();
		this.qty=cart.getQuantity();
		this.setProduct(cart.getProduct());
		
	}
}
