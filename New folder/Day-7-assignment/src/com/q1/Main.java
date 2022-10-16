package com.q1;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Demo d=new Demo();
		
		d.start();
		synchronized(d) {
			d.wait();
			
		}System.out.println(d.x);
		
	}

}
