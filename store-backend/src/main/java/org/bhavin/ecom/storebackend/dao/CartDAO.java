package org.bhavin.ecom.storebackend.dao;

import java.util.List;

import org.bhavin.ecom.storebackend.entity.Cart;

public interface CartDAO {

	public List<Cart> findAll();
	
	public Cart findByID(int theId);
	
}
