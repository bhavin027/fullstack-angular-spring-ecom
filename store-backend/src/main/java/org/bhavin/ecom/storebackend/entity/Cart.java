package org.bhavin.ecom.storebackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="user_name")
	private String username;
	
	@Column(name="image")
	private String image;
	
	@Column(name="product_id")
	private int productId;
	
	@Column(name="product")
	private String product;
	
	@Column(name="size")
	private String size;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="price")
	private int price;
	
	public Cart() {}

	public Cart(int id, String username, String image, int productId, String product, String size, int quantity,
			int price) {
		this.id = id;
		this.username = username;
		this.image = image;
		this.productId = productId;
		this.product = product;
		this.size = size;
		this.quantity = quantity;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", username=" + username + ", image=" + image + ", productId=" + productId
				+ ", product=" + product + ", size=" + size + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
}
