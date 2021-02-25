package org.bhavin.ecom.storebackend.dao;

import java.util.List;

import org.bhavin.ecom.storebackend.entity.ProductCategories;
import org.bhavin.ecom.storebackend.entity.ProductReviews;
import org.bhavin.ecom.storebackend.entity.Products;

public interface ProductsDAO {

	public List<ProductCategories> findAllCategories();
	
	public List<Products> findAllProducts();
	
	public ProductCategories findCategoryById(int theId);
	
	public Products findProductById(int theId);
	
	public ProductCategories saveCategory(ProductCategories theCategory);
	
	public Products saveProduct(Products theProduct);
	
	public void deleteCategory(int theId);
	
	public void deleteProduct(int theId);
	
	public List<ProductReviews> findAllReviews();
	
	public ProductReviews findReviewById(int theId);
	
	public ProductReviews saveReview(ProductReviews theReview);
	
	public void deleteReviews(int theId);
}







