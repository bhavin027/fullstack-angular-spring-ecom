package org.bhavin.ecom.storebackend.service;

import java.util.List;

import org.bhavin.ecom.storebackend.dao.CartDAO;
import org.bhavin.ecom.storebackend.entity.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CartServiceImpl implements CartService {

	private CartDAO cartDAO;
	
	@Autowired
	public CartServiceImpl(CartDAO theDAO) {
		this.cartDAO = theDAO;
	}
	
	@Override
	@Transactional
	public List<Cart> findAll() {
		return cartDAO.findAll();
	}

	@Override
	@Transactional
	public Cart findByID(int theId) {
		return cartDAO.findByID(theId);
	}

}
