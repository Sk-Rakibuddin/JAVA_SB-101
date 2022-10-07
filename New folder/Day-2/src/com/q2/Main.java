package com.q2;

public class Main {

	public static void main(String[] args) {
		
		X x=Integer::parseInt;
		int n=x.convetStringToNumber("200");
		System.out.println(n);
		
		
	}

}
