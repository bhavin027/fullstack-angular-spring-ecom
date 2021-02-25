package org.bhavin.ecom.storebackend.service;

import java.util.List;

import org.bhavin.ecom.storebackend.entity.ProductCategories;
import org.bhavin.ecom.storebackend.entity.Products;

public interface ProductsService {

	public List<ProductCategories> findAllCategories();
	
	public List<Products> findAllProducts();
	
	public ProductCategories findCategoryById(int theId);
	
	public Products findProductById(int theId);
	
	public ProductCategories saveCategory(ProductCategories theCategory);
	
	public Products saveProduct(Products theProduct);
	
	public void deleteCategory(int theId);
	
	public void deleteProduct(int theId);
	
}
