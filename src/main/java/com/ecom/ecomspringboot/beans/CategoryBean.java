package com.ecom.ecomspringboot.beans;

import java.io.Serializable;

import lombok.Data;

@Data
public class CategoryBean implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private int id;
    private String name;
    
    public static CategoryBean newInstance() {
    	CategoryBean bean = new CategoryBean();
		return bean;
	}
}
