package com.masai.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.masai.exception.ProductNotFoundException;
import com.masai.model.Product;
import com.masai.model.ProductDTO;
import com.masai.repository.ProductRepoDao;

@Service
public class ProductServiceImpl implements ProductService  {

	@Autowired
	private ProductRepoDao dao;
	
	
	@Override
	public Product registerProduct(Product p) {
		
		return dao.save(p);
	}


	@Override
	public List<Product> getAllProducts ()throws ProductNotFoundException  {
		List<Product>  product=dao.findAll();
		if(product.size()==0)
			throw new ProductNotFoundException("product not found");
		else return product;
		
	}


	@Override
	public Product updateProdcut(Product p) throws ProductNotFoundException {
		Optional<Product> opt= dao.findById(p.getProductId());
	if(opt.isPresent()) {
		
		Product product=dao.save(p);
		return product;
		
	}else
		throw new ProductNotFoundException("Invalid Product details");
		
		
	}


	@Override
	public Product deleteProductById(Integer pid) throws ProductNotFoundException {

     Optional<Product> opt= dao.findById(pid);
		if(opt.isPresent()) {
			
		Product p= opt.get();
		dao.delete(p);
		
		return p;	
			
			
		}else
			throw new ProductNotFoundException("Product does not exist with id "+pid);
		
		
	}


	@Override
	public List<Product> getsProductByCategory(String category) throws ProductNotFoundException {
		
		List<Product> p=dao.findByCategory(category);
		
		if(p.size()==0) {
			throw new ProductNotFoundException("product not found");
		}else
			return p;
		
	}


	@Override
	public Product getProductByProductId(Integer pid) throws ProductNotFoundException {
		
		Optional<Product> opt=dao.findById(pid);
		if(opt.isPresent()) {
			return opt.get();
		}
		else
			throw new ProductNotFoundException("Product not found with id "+pid);
		
		
		
		
	}


	@Override
	public Product updateProductByPrice(Double price, Integer pid) throws ProductNotFoundException {
		
		Optional<Product> opt=dao.findById(pid);
		if(opt.isEmpty()) {
			throw new ProductNotFoundException("Product not found with id "+pid);
		}
		else {
			Product product=opt.get();
			product.setPrice(product.getPrice()+price);
			return dao.save(product);
			
		}
			
		
		
		
	}


	@Override
	public List<ProductDTO> getProductNameQtyPrice() throws ProductNotFoundException {
		List<ProductDTO> list=dao.find();
		if(list.isEmpty()) {
			throw new ProductNotFoundException("Product not found");
		}
		else return list;
			
	}
	
	
	

	
	
}
