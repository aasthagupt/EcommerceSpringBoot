package com.ecom.ecomspringboot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ecom.ecomspringboot.entity.User;
import com.ecom.ecomspringboot.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUserDetail() {
		return userRepository.findAll();
	}

	public User addUser(User user) {
		User u = userRepository.save(user);
		return u;
	}

	public void deleteUserById(int id) {

		userRepository.deleteById(id);
		ResponseEntity.ok("deleted");

	}
	
//	public Integer isUserPresent(User user){
//        User user1 = userRepository.getCustomerByEmailAndName(user.getEmail(),user.getFirstname());
//        return user1!=null ? user1.getId(): null ;
//    }
}
