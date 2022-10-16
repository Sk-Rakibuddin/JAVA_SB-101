package com.q4;

import java.util.concurrent.Callable;

public class MyCallable implements Callable <Integer>{

  int x;
  
  public MyCallable(int x) {
		this.x=x;
	}
	
	
	
	
	@Override
	public Integer call() throws Exception {
		System.out.println(x+" "+Thread.currentThread().getName());
		int sum=0;
		for(int i=1; i<=x; i++) {
			sum+=i;
		}
		return sum;
	}

}
