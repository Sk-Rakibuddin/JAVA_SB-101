package com.q1;
import java.util.*;
import java.util.stream.Collectors;
public class Main {

//	1. Create a List of 5 product objects.
//	2. From the product list filter the products whose quantity is more than 10 in a
//	separate List of Products.
//	3. Sort the Filtered List of Products by the price in ascending order.
//	4. Print all the products one by one from both Lists (original list and Filtered list)
	public static void main(String[] args) {
		
		
		
	Product p1=new Product(123,"Laptop",39000,3);
	Product p2=new Product(113,"Mouse",30090,11);
	Product p3=new Product(133,"Keypad",900,12);
	Product p4=new Product(123,"Router",3000,25);
	Product p5=new Product(123,"Charger",300,4);
	
	List<Product> list=Arrays.asList(p1,p2,p3,p4,p5);
	
	
	List<Product> list1=list.stream()
			                .filter(s-> s.getQuantity()>10).collect(Collectors.toList());
	list1.forEach(System.out::println);
	
	Comparator<Product> asc=(s1,s2)->(int) s1.getPrice()-s2.getPrice();
	Collections.sort(list1,asc);
	
	list1.forEach(System.out::println);
	for(Product l1:list) {
		System.out.println(l1.getProductName());
		System.out.println(l1.getQuantity());
		System.out.println(l1.getPrice());
		System.out.println("***********");
	}
	
	}
	
}
