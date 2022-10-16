package com.q4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService service=Executors.newFixedThreadPool(3);
		
		MyCallable[] arr= {
			new MyCallable(10),	
			new MyCallable(12),
			new MyCallable(15),
			new MyCallable(18),
			new MyCallable(19),
			new MyCallable(20)
		};
		
		for(MyCallable s:arr) {
			Future f=service.submit(s);
			System.out.println(f.get());
		}
		
		service.shutdown();
		
		
	}
	
}
