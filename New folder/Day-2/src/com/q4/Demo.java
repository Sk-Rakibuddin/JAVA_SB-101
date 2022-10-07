package com.q4;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		Product p1=new Product(12321,"mobile",2,20000);
		Product p2=new Product(12301,"laptop",3,200000);
		Product p3=new Product(12311,"watch",1,2000);
		Product p4=new Product(12341,"bike",0,90000);
		Product p5=new Product(12351,"headphone",4,2000);

		List<Product> productDetails=Arrays.asList(p1,p2,p3,p4,p5);
		
//	//before sort
//		for(Product t:productDetails) {
//			System.out.println(t);
//		}
		
		Comparator<Product> desc=(a1,a2) -> (int) a2.getPrice()-a1.getPrice();
		
		Collections.sort(productDetails,desc);
		
		for(Product t:productDetails) {
			System.out.println(t);
		}
		
	}

}
