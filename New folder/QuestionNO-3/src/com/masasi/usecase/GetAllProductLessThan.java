package com.masasi.usecase;

import java.util.List;
import java.util.Scanner;

import com.masai.dao.ProductDao;
import com.masai.dao.ProductDaoImpl;
import com.masai.exceptions.ProductException;
import com.masai.model.Product;

public class GetAllProductLessThan {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter quantity");
		int q=s.nextInt();
		
		ProductDao dao = new ProductDaoImpl();
		try {
		 	List<Product> products = dao.getAllProductQuantityLessThan(q);
		 	products.forEach(x-> System.out.println(x));
			 	
		 	
		} catch (ProductException e) {
			System.out.println(e.getMessage());
		}

	}

}
