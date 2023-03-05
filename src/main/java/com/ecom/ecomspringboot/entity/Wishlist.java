//package com.ecom.ecomspringboot.entity;
//
//import java.sql.Date;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToOne;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name="wishlist")
//public class Wishlist {
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private int id;
//	
//	@OneToOne(targetEntity=User.class,fetch=FetchType.EAGER)
//	@JoinColumn(name="user_id")
//	private User user;
//	@Column(name="created_date")
//	private Date createdDate;
//	
//
//	private Product product;
//
//	public int getId() {
//		return id;
//	}
//
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public User getUser() {
//		return user;
//	}
//
//
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//
//
//	public Date getCreatedDate() {
//		return createdDate;
//	}
//
//
//
//	public void setCreatedDate(Date createdDate) {
//		this.createdDate = createdDate;
//	}
//
//
//
//	public Product getProduct() {
//		return product;
//	}
//
//
//
//	public void setProduct(Product product) {
//		this.product = product;
//	}
//
//
//	public Wishlist() {
//	}
//
//
//	public Wishlist(int id, User user, Date createdDate, Product product) {
//		this.id = id;
//		this.user = user;
//		this.createdDate = createdDate;
//		this.product = product;
//	}
//
//
//	public Wishlist(Product product) {
//		//this.user = user;
//		this.product = product;
//	}
//	
//	
//	
//	
//	
//	
//
//}
