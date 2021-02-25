package org.bhavin.ecom.storebackend.rest;

import java.util.List;

import org.bhavin.ecom.storebackend.entity.DeleteMessage;
import org.bhavin.ecom.storebackend.entity.ProductCategories;
import org.bhavin.ecom.storebackend.entity.Products;
import org.bhavin.ecom.storebackend.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/dashboard")
public class ProductsRestController {

	private ProductsService productsService;
	
	@Autowired
	public ProductsRestController(ProductsService theProductsService) {
		this.productsService = theProductsService;
	}
	
	@GetMapping(path="/categories")
	public List<ProductCategories> getAllCategories() {
		
		List<ProductCategories> theCategories = productsService.findAllCategories();
		
		return theCategories;
		
	}
	
	@GetMapping(path="/categories/{catId}")
	public ProductCategories getCategoryById(@PathVariable int catId) {
		
		ProductCategories theCategory = productsService.findCategoryById(catId);
		
		if(theCategory == null) {
			throw new RuntimeException("Category Not Found, ID: "+catId);
		}
		
		return theCategory;
		
	}
	
	@GetMapping(path="/products")
	public List<Products> getAllProducts() {
		
		List<Products> theProducts = productsService.findAllProducts();
		
		return theProducts;
		
	}
	
	@GetMapping(path="/products/{prdtId}")
	public Products getProductById(@PathVariable int prdtId) {
		
		Products theProduct = productsService.findProductById(prdtId);
		
		if(theProduct == null) {
			throw new RuntimeException("Product Not Found, ID: "+prdtId);
		}
		
		return theProduct;
		
	}
	
	@PostMapping(path="/categories")
	public ProductCategories addProductCategory(@RequestBody ProductCategories theCategory) {
		
		theCategory.setId(0);
		
		ProductCategories tempCat = productsService.saveCategory(theCategory);
		
		return tempCat;
		
	}
	
	@PostMapping(path="/products")
	public Products addProduct(@RequestBody Products theProduct) {
		
		theProduct.setId(0);
		
		Products tempPrdt = productsService.saveProduct(theProduct);
		
		return tempPrdt;
		
	}
	
	@PutMapping(path="/categories")
	public ProductCategories updateProductCategory(@RequestBody ProductCategories theCat) {
		
		return productsService.saveCategory(theCat);
	}
	
	@PutMapping(path="/products")
	public Products updateProduct(@RequestBody Products theProduct) {
		
		return productsService.saveProduct(theProduct);
	}
	
	@DeleteMapping(path="/categories/{catId}")
	public DeleteMessage deleteProductCategory(@PathVariable int catId) {
		
		ProductCategories tempCat = productsService.findCategoryById(catId);
		
		if(tempCat == null) {
			throw new RuntimeException("Category Does Not Exist, ID: "+catId);
		}
		
		productsService.deleteCategory(catId);
		
		return new DeleteMessage("Category ID: "+catId+" Deleted Successfully!");
		
	}
	
	@DeleteMapping(path="/products/{prdtId}")
	public DeleteMessage deleteProductFromDB(@PathVariable int prdtId) {
		
		Products tempPrdt = productsService.findProductById(prdtId);
		
		if(tempPrdt == null) {
			throw new RuntimeException("Product Does Not Exist, ID: "+prdtId);
		}
		
		productsService.deleteProduct(prdtId);
		
		return new DeleteMessage("Product ID: "+prdtId+" Deleted Successfully!");
	}
	
}


