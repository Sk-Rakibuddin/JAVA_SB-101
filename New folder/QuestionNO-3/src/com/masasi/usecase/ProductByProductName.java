package com.masasi.usecase;

import java.util.List;
import java.util.Scanner;

import com.masai.dao.ProductDao;
import com.masai.dao.ProductDaoImpl;
import com.masai.exceptions.ProductException;
import com.masai.model.Product;

public class ProductByProductName {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Product Name");
		String q=s.next();
		
		ProductDao dao = new ProductDaoImpl();
		try {
		 	Product products = dao.getProductByProductName(q);
		 	System.out.println(products);
			 	
		 	
		} catch (ProductException e) {
			System.out.println(e.getMessage());
		}


	}

}
