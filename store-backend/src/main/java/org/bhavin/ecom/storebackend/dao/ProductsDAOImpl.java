package org.bhavin.ecom.storebackend.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.bhavin.ecom.storebackend.entity.ProductCategories;
import org.bhavin.ecom.storebackend.entity.ProductReviews;
import org.bhavin.ecom.storebackend.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductsDAOImpl implements ProductsDAO {

	private EntityManager entityManager;
	
	@Autowired
	public ProductsDAOImpl(EntityManager theEntityManager) {
		this.entityManager = theEntityManager;
	}
	
	@Override
	public List<ProductCategories> findAllCategories() {
		
		Query theQuery = entityManager.createQuery("from ProductCategories", ProductCategories.class);
		
		List<ProductCategories> theCategories = theQuery.getResultList();
		
		return theCategories;
		
	}

	@Override
	public List<Products> findAllProducts() {

		Query theQuery = entityManager.createQuery("from Products", Products.class);
		
		List<Products> theProducts = theQuery.getResultList();
		
		return theProducts;
	}

	@Override
	public ProductCategories findCategoryById(int theId) {
		
		ProductCategories theCategory = entityManager.find(ProductCategories.class, theId);
		
		return theCategory;
	}

	@Override
	public Products findProductById(int theId) {

		Products theProduct = entityManager.find(Products.class, theId);
		
		return theProduct;
	}

	@Override
	public ProductCategories saveCategory(ProductCategories theCategory) {
		
		ProductCategories temp = entityManager.merge(theCategory);
		
		theCategory.setId(temp.getId());
		
		return theCategory;
	}

	@Override
	public Products saveProduct(Products theProduct) {
		
		Products temp = entityManager.merge(theProduct);
		
		theProduct.setId(temp.getId());
		
		return theProduct;
	}

	@Override
	public void deleteCategory(int theId) {

		Query theQuery = entityManager.createQuery("delete from ProductCategories where id=:catId");
		
		theQuery.setParameter("catId", theId);
		
		theQuery.executeUpdate();
		
	}

	@Override
	public void deleteProduct(int theId) {
		
		Query theQuery = entityManager.createQuery("delete from Products where id=:prdtId");
		
		theQuery.setParameter("prdtId", theId);
		
		theQuery.executeUpdate();
		
	}

	@Override
	public List<ProductReviews> findAllReviews() {

		Query theQuery = entityManager.createQuery("from ProductReviews", ProductReviews.class);
		
		List<ProductReviews> theReviews = theQuery.getResultList();
		
		return theReviews;
	}

	@Override
	public ProductReviews findReviewById(int theId) {
		
		ProductReviews theReview = entityManager.find(ProductReviews.class, theId); 
		
		return theReview;
	}

	@Override
	public ProductReviews saveReview(ProductReviews theReview) {

		ProductReviews temp = entityManager.merge(theReview);
		
		theReview.setId(temp.getId());
		
		return theReview;
	}

	@Override
	public void deleteReviews(int theId) {
		
		Query theQuery = entityManager.createQuery("delete from ProductReviews where id=:reviewId");
		
		theQuery.setParameter("reviewId", theId);
		
		theQuery.executeUpdate();
		
	}

}
