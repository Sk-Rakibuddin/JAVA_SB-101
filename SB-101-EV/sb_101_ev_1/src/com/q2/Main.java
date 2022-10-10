package com.q2;
import java.util.*;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		Product Pen=new Product(123,"Pen",50,5);
		Product Pencil=new Product(113,"Pencil",30,3);
		Product Rubber=new Product(153,"Rubber",20,1);
		Product Sharpner=new Product(143,"Sharpner",20,5);
		Product Scale=new Product(193,"Scale",10,1);
		Product Compass=new Product(183,"Compass",20,5);
		
	List<Product> lists=new ArrayList();
	lists.add(Pen);
	lists.add(Pencil);
	lists.add(Rubber);
	lists.add(Scale);
	lists.add(Sharpner);
	lists.add(Compass);
     System.out.println(lists);
	
	
	List<Product> list1=lists.stream().filter(x ->x.getQuantity()<2).collect(Collectors.toList());
     
	System.out.println(list1);
	
	Comparator<Product> desc=(a1,a2) -> (int) a2.getPrice()-a1.getPrice();
	
	Collections.sort(lists,desc);
	
	
	lists.forEach(System.out::println);
	
	
	}
}
