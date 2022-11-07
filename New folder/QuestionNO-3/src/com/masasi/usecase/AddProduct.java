package com.masasi.usecase;

import java.util.Scanner;

import com.masai.dao.ProductDao;
import com.masai.dao.ProductDaoImpl;
import com.masai.model.Product;



public class AddProduct {

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter product id");
		int pid=s.nextInt();
		
		System.out.println("Enter product name");
		String pname=s.next();
		
		System.out.println("Enter price");
		int price=s.nextInt();
		
		System.out.println("enter Quantity");
		int quantity=s.nextInt();
		
		ProductDao dao=new ProductDaoImpl();
		
		Product product=new Product(pid,pname,price,quantity);
		
		String result=dao.addProduct(product);
		System.out.println(result);
		
	}

}
