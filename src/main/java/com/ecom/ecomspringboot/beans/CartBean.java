package com.ecom.ecomspringboot.beans;

import java.util.List;

import lombok.Data;

@Data
public class CartBean {
	private List<CartItemBean> cartItem;
	
	private double totalcost;
	
	
	public List<CartItemBean> getCartItem() {
		return cartItem;
	}
	public void setCartItem(List<CartItemBean> cartItem) {
		this.cartItem = cartItem;
	}
	public double getTotalcost() {
		return totalcost;
	}
	public void setTotalcost(double totalcost) {
		this.totalcost = totalcost;
	}
	public CartBean() {
		super();
	}
	
	

}
