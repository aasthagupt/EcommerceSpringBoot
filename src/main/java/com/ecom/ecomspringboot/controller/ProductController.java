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

import com.ecom.ecomspringboot.beans.ProductBean;
import com.ecom.ecomspringboot.entity.Category;
import com.ecom.ecomspringboot.entity.Product;
import com.ecom.ecomspringboot.service.CategoryService;
import com.ecom.ecomspringboot.service.ProductService;

@RestController
public class ProductController {
    
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;
    
    @GetMapping("/admin/product")
	public List<Product> getProduct(){
    	//model.addAttribute(productService.getAllProduct());
    	return productService.getAllProduct();
    }
    
    @PostMapping("/admin/product/add")
    public Product productAddGet(@RequestBody Product product,Model model)
    {
    	//model.addAttribute(new ProductBean());   	
    	model.addAttribute(categoryService.getAllCategory());
		return productService.addProduct(product);    	
    }
    
//    public Product add(@RequestBody  ProductBean productBean){
//        return productService.addProduct(productBean);
//        //return ResponseEntity.ok("PRODUCT_SAVED");
//    }
	
    @DeleteMapping("/admin/product/{id}")
    public void deleteProduct(@PathVariable("id") int id)
    {
    	productService.removeProductById(id);
    }
    
    @PutMapping("/admin/product/update/{id}")
    public ProductBean updateCategory(@PathVariable int id,Model model)
    {
    	
        Product product=productService.getProductById(id).get();
        ProductBean p=new ProductBean();
        p.setId(product.getId());
        p.setProd_name(product.getProd_name());
        p.setCategoryId(product.getCategory_id());
        p.setPrice(product.getPrice());
        p.setQty(product.getQty());
        p.setDescription(product.getDescription());
        model.addAttribute(categoryService.getAllCategory());
        model.addAttribute(p);
        return p;
        
    }
}
