package com.masasi.usecase;

import java.util.Scanner;

import com.masai.dao.ProductDao;
import com.masai.dao.ProductDaoImpl;
import com.masai.model.Product;

public class AddProductIdQuantity {

	public static void main(String[] args) {

    Scanner s=new Scanner(System.in);
    System.out.println("Enter product id");
    int n=s.nextInt();
    System.out.println("enter product quantity");
     int m=s.nextInt();
     
     
     ProductDao dao=new ProductDaoImpl();
		
		Product product=new Product();
		
		String result=dao.addProduct(product);
		System.out.println(result);


	}

}
