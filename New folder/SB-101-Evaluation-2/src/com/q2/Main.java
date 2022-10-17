package com.q2;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread m=new MyThread();
		
		m.start();
		synchronized(m) {
			m.wait();
		}
		
		System.out.println("Product="+m.p);
		
		
	}

}
