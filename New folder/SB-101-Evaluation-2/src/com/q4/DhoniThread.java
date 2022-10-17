package com.q4;

public class DhoniThread extends Thread {
	int sum=0;
@Override
	public void run() {
		for(int i=1; i<=20;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
}
