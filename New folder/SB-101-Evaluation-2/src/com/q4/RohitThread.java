package com.q4;

public class RohitThread extends Thread {
	int product=1;
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			product*=i;
		}
		System.out.println(product);
	}
	
}
