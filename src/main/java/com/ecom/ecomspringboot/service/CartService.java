package com.ecom.ecomspringboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.ecomspringboot.beans.AddToCartBean;
import com.ecom.ecomspringboot.beans.CartBean;
import com.ecom.ecomspringboot.beans.CartItemBean;
import com.ecom.ecomspringboot.entity.Cart;
import com.ecom.ecomspringboot.entity.Product;
import com.ecom.ecomspringboot.entity.User;
import com.ecom.ecomspringboot.repository.CartRepository;

@Service
public class CartService {
	
	@Autowired
	ProductService productService;
	@Autowired
	CartRepository cartRepository;

	public Cart addToCart(AddToCartBean addToCartBean) {
		//validating the product id
		Product product=productService.findById(addToCartBean.getProduct_id());
		Cart cart=new Cart();
		cart.setProduct(product);
		cart.setQuantity(addToCartBean.getQuantity());
		Cart c=cartRepository.save(cart);	
		return c;
	}

	

	public CartBean listCartItems(){
		final List<Cart> cartList=cartRepository.findAll();
		List<CartItemBean> cartItems=new ArrayList<>();
		double totalCost=0;
		for(Cart cart: cartList)
		{
			CartItemBean cartItemBean=new CartItemBean(cart);
			if(cart.getProduct() != null) {
				totalCost+=cartItemBean.getQty()*cart.getProduct().getPrice();	
			}
			cartItems.add(cartItemBean);
		}
		
		CartBean cartBean=new CartBean();
		cartBean.setTotalcost(totalCost);
		cartBean.setCartItem(cartItems);
		return cartBean;		
	}
	public void deleteById(int id) {
        cartRepository.deleteById(id);
    }

    public List<Cart> getAll() {
        return cartRepository.findAll();
    }

}
