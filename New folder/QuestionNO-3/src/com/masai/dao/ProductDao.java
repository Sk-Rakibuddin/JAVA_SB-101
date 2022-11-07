package com.masai.dao;

import java.util.List;

import com.masai.exceptions.ProductException;
import com.masai.model.Product;

public interface ProductDao {

	public String addProduct(Product product) ;
	
	public List<Product> getAllProducts() throws ProductException;
	
	public List<Product> getAllProductQuantityLessThan(int quantity)throws
	ProductException;
	
	
	public Product getProductByProductName(String pname)throws
	ProductException;
	
	
	
	public String addProductQuantity(int productId, int Quantity)throws
	
	ProductException;

	public String deleteProductByProductName(String pname) throws ProductException;
	
	
	
	
}
