package com.ecom.ecomspringboot.beans;

import java.io.Serializable;

import com.ecom.ecomspringboot.entity.Category;

import lombok.Data;

@Data
public class ProductBean implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private Long id;
    private String prod_name;
    private int categoryId;
    private double price;
    private int qty;
    private String description;
    private String prod_img;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProd_img() {
		return prod_img;
	}
	public void setProd_img(String prod_img) {
		this.prod_img = prod_img;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setcategory_id(Category getcategory_id) {
		// TODO Auto-generated method stub
		
	}
    
    
    
	  
    
    

}
