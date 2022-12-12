package com.masai.service;



import java.util.List;

import com.masai.exception.ProductNotFoundException;
import com.masai.model.Product;
import com.masai.model.ProductDTO;

public interface ProductService {

	public Product registerProduct(Product p) throws ProductNotFoundException;
	public List<Product> getAllProducts()throws ProductNotFoundException;
	public Product updateProdcut(Product p)throws ProductNotFoundException;
	public Product deleteProductById(Integer pid)throws ProductNotFoundException;
	public Product getProductByProductId(Integer pid) throws ProductNotFoundException;
	public List<Product> getsProductByCategory(String category)throws 
	ProductNotFoundException;
	public Product updateProductByPrice(Double price,Integer pid) throws ProductNotFoundException;
	public List<ProductDTO> getProductNameQtyPrice() throws ProductNotFoundException;
}
