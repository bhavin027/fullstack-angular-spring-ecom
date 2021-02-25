package org.bhavin.ecom.storebackend.service;

import java.util.List;

import org.bhavin.ecom.storebackend.dao.ProductsDAO;
import org.bhavin.ecom.storebackend.entity.ProductCategories;
import org.bhavin.ecom.storebackend.entity.ProductReviews;
import org.bhavin.ecom.storebackend.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductsServiceImpl implements ProductsService {
	
	private ProductsDAO productsDAO;
	
	@Autowired
	public ProductsServiceImpl(ProductsDAO theProductsDAO) {
		this.productsDAO = theProductsDAO;
	}

	@Override
	@Transactional
	public List<ProductCategories> findAllCategories() {

		return productsDAO.findAllCategories();
	}

	@Override
	@Transactional
	public List<Products> findAllProducts() {

		return productsDAO.findAllProducts();
	}

	@Override
	@Transactional
	public ProductCategories findCategoryById(int theId) {

		return productsDAO.findCategoryById(theId);
	}

	@Override
	@Transactional
	public Products findProductById(int theId) {

		return productsDAO.findProductById(theId);
	}

	@Override
	@Transactional
	public ProductCategories saveCategory(ProductCategories theCategory) {

		return productsDAO.saveCategory(theCategory);
	}

	@Override
	@Transactional
	public Products saveProduct(Products theProduct) {

		return productsDAO.saveProduct(theProduct);
	}

	@Override
	@Transactional
	public void deleteCategory(int theId) {

		productsDAO.deleteCategory(theId);
		
	}

	@Override
	@Transactional
	public void deleteProduct(int theId) {
		
		productsDAO.deleteProduct(theId);
		
	}

	@Override
	@Transactional
	public List<ProductReviews> findAllReviews() {

		return productsDAO.findAllReviews();
	}

	@Override
	@Transactional
	public ProductReviews findReviewById(int theId) {

		return productsDAO.findReviewById(theId);
	}

	@Override
	@Transactional
	public ProductReviews saveReview(ProductReviews theReview) {

		return productsDAO.saveReview(theReview);
	}

	@Override
	@Transactional
	public void deleteReviews(int theId) {

		productsDAO.deleteReviews(theId);
	}

}
