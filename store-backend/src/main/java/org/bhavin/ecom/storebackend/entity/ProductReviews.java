package org.bhavin.ecom.storebackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_reviews")
public class ProductReviews {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="product_id")
	private int productId;
	
	@Column(name="username")
	private String username;
	
	@Column(name="rating")
	private int rating;
	
	@Column(name="comment")
	private String comment;
	
	@Column(name="approval")
	private boolean approval;
	
	public ProductReviews() {}

	public ProductReviews(int id, int productId, String username, int rating, String comment, boolean approval) {
		this.id = id;
		this.productId = productId;
		this.username = username;
		this.rating = rating;
		this.comment = comment;
		this.approval = approval;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean isApproval() {
		return approval;
	}

	public void setApproval(boolean approval) {
		this.approval = approval;
	}

	@Override
	public String toString() {
		return "ProductReviews [id=" + id + ", productId=" + productId + ", username=" + username + ", rating=" + rating
				+ ", comment=" + comment + ", approval=" + approval + "]";
	}
	
	
}
