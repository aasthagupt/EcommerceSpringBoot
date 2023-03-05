package com.ecom.ecomspringboot.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@ToString
@Entity
@Data
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String Firstname;
	private String lastName;
	
	@Column(nullable=false,unique=true)
	private String email;
	
	@Column(nullable=false)
	private String password;
	private String Phone_no;
	private String house_no;
	private String city;
	private String country;
	private boolean is_active=false;	
//	@ManyToMany(cascade=CascadeType.MERGE,fetch =FetchType.EAGER)
////	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name =  "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
//	@JoinTable(name = "USERS_ROLES", joinColumns = { @JoinColumn(name = "USER_ID") }, inverseJoinColumns = { @JoinColumn(name = "GROUP_ID") })
//	private List<Role> roles;
//	private List<Role> getRoles;
//	
	
	public int getId() {
		return id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone_no() {
		return Phone_no;
	}
	public void setPhone_no(String phone_no) {
		Phone_no = phone_no;
	}
	public String getHouse_no() {
		return house_no;
	}
	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public boolean isIs_active() {
		return is_active;
	}
	
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public User(User user){
		this.Firstname = user.getFirstname();
		this.lastName = user.getLastName();
		this.email = user.getEmail();
		this.password = user.getPassword();
		Phone_no = user.getPhone_no();
		this.house_no = user.getHouse_no();
		this.city = user.getCity();
		this.country = user.getCountry();
		//this.is_active = is_active;
		//this.roles = user.getRoles;
	}
	public User() {
		
	}
	public User(String firstname, String email) {
		super();
		Firstname = firstname;
		this.email = email;
	}
//	public void setId(Integer customerIdFromDb) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	
//	
//
}
	
	
	

