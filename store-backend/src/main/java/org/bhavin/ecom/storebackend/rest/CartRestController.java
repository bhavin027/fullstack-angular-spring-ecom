package org.bhavin.ecom.storebackend.rest;

import java.util.List;

import org.bhavin.ecom.storebackend.entity.Cart;
import org.bhavin.ecom.storebackend.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(path="/dashboard")
public class CartRestController {

	private CartService theService;
	
	@Autowired
	public CartRestController(CartService theCartService) {
		this.theService = theCartService;
	}
	
	@GetMapping(path="/cart")
	public List<Cart> getAllCartItems() {
		List<Cart> theCart = theService.findAll();
		return theCart;
	}
	
	@GetMapping(path="/cart/{cartId}")
	public Cart getCartItem(@PathVariable int cartId) {
		Cart item = theService.findByID(cartId);
		if(item == null) {
			throw new RuntimeException("Cart Item Not Found, ID: "+cartId);
		}
		return item;
	}
	
}
