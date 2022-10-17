package com.q3;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
	
	int n;
	public MyCallable(int n) {
		this.n=n;
	}

	@Override
	public Object call() throws Exception {
		
		System.out.println(Thread.currentThread().getName()+" "+n);
		int x=1;
		for(int i=1; i<=n;i++) {
			x*=n;
		}
		return x;
	}

}
