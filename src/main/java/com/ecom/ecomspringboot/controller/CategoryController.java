package com.ecom.ecomspringboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ecom.ecomspringboot.entity.Category;
import com.ecom.ecomspringboot.service.CategoryService;


@RestController
public class CategoryController{
    @Autowired
    private CategoryService categoryService;
    

    @GetMapping("/admin")
    public String adminHome(){
        return "adminHome";
    }

    @GetMapping("/admin/category")
    public List<Category> getCat()
    {
        return categoryService.getAllCategory();
    } 
    
    @PostMapping("admin/category")
    public String createCategory(@RequestBody Category category) {
		categoryService.addCategory(category);
//    	Category categoryEntity=categoryService.addCategory(category);
//    	CategoryBean response = getMapper().mapSrcToDest(categoryEntity, CategoryBean.newInstance());
		return "successfully Created.." ;
    }
        
    @DeleteMapping("/admin/category/delete/{id}")
    public void deleteCategory(@PathVariable("id") int id)
    {
    	 categoryService.removeCategoryById(id);
        
    }
    
    @PutMapping("/admin/category/update/{id}")
    public Category updateCategory(@PathVariable int id,Category category)
    {
//        Optional<Category> category= categoryService.getCategoryById(id);
//        if(category.isPresent())
//        {
//        	model.addAttribute(category.get()); 
//        }
//        
//        return category;
    	return categoryService.editCategory(id, category);
    	
    }
    

}
