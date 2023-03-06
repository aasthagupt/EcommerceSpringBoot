package com.ecom.ecomspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.ecomspringboot.entity.User;

import com.ecom.ecomspringboot.service.UserService;

@RestController
public class UserController {
	
	@Autowired
    private UserService userService;
    
    @GetMapping("/user")
	public List<User> getUser(){
    	return userService.getAllUserDetail();
    }
    
    @PostMapping("/user/add")
    public User userAdd(@RequestBody User user,Model model)
    {
    	return userService.addUser(user);
    	
    }
	
    @DeleteMapping("/user/delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") int id)
    {
    	userService.deleteUserById(id);
		return new ResponseEntity<>("User removed successfully", HttpStatus.OK);
    }
    
    @PutMapping("/user/update/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable("id") int id, @RequestBody User user)
    {
    	userService.updateUser(id, user);
		return new ResponseEntity<>("User updated successfully", HttpStatus.OK);

    }
}
