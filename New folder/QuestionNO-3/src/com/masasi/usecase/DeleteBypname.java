package com.masasi.usecase;

import java.util.Scanner;

import com.masai.dao.ProductDao;
import com.masai.dao.ProductDaoImpl;
import com.masai.exceptions.ProductException;


public class DeleteBypname {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter productname you want to delete");
		String str=s.next();
		
		ProductDao dao = new ProductDaoImpl();
		try {
		 	String products = dao.deleteProductByProductName(str);
		 	System.out.println(products);
			 	
		 	
		} catch (ProductException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
