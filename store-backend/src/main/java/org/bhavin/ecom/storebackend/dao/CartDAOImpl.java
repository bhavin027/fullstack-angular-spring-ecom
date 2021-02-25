package org.bhavin.ecom.storebackend.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.bhavin.ecom.storebackend.entity.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CartDAOImpl implements CartDAO {

	private EntityManager entityManager;
	
	@Autowired
	public CartDAOImpl(EntityManager theEntityManager) {
		this.entityManager = theEntityManager;
	}
	
	@Override
	public List<Cart> findAll() {
		
		Query theQuery = entityManager.createQuery("from Cart", Cart.class);
		
		List<Cart> theCart = theQuery.getResultList();
		
		return theCart;
	}

	@Override
	public Cart findByID(int theId) {

		Cart theCart = entityManager.find(Cart.class, theId);
		
		return theCart;
	}

}
