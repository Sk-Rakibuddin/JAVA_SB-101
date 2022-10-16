package com.q3;

public class Main extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<20;i++) {
			if(i%2==1) {
	         System.out.println(i);
			}
		}
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		Main m=new Main();
		m.start();
		m.join();
		for(int i=0; i<20;i++) {
			if(i%2==0) {
	         System.out.println(i);
			}
		}
	}

}
