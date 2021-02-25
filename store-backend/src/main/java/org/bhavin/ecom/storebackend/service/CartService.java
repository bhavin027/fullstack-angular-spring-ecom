package org.bhavin.ecom.storebackend.service;

import java.util.List;

import org.bhavin.ecom.storebackend.entity.Cart;

public interface CartService {

	public List<Cart> findAll();
	
	public Cart findByID(int theId);
	
}
