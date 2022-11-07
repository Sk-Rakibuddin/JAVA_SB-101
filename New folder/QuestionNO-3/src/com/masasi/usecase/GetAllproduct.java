package com.masasi.usecase;

import java.util.List;

import com.masai.dao.ProductDao;
import com.masai.dao.ProductDaoImpl;
import com.masai.exceptions.ProductException;
import com.masai.model.Product;



public class GetAllproduct {

	public static void main(String[] args) {

		ProductDao dao = new ProductDaoImpl();
		
		
		try {
		 	List<Product> products = dao.getAllProducts();
		 	products.forEach(s -> System.out.println(s));
			 	
		 	
		} catch (ProductException e) {
			System.out.println(e.getMessage());
		}

	}

}
