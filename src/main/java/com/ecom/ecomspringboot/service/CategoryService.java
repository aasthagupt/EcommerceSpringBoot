package com.ecom.ecomspringboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ecom.ecomspringboot.entity.Category;
import com.ecom.ecomspringboot.repository.CategoryRepository;

@Service
public class CategoryService {
	    @Autowired
	    CategoryRepository categoryRepository;
	    
	    public List<Category> getAllCategory() {
	        return categoryRepository.findAll();
	    }
	    
	    public Category addCategory(Category category)
	    {
	        Category s=categoryRepository.save(category);
	        return s;
	    }
	    
	    public ResponseEntity<String> removeCategoryById(int id){
	    	
	    	Optional<Category> c = categoryRepository.findById(id);
	        if (c.isPresent()) {
	        	categoryRepository.deleteById(id);
	        }
			return ResponseEntity.ok("deleted");
			
	    }
	    
	    public Optional<Category> getCategoryById(int id){
	        return categoryRepository.findById(id);
	    }
	         
	    
	    
	    
	}

