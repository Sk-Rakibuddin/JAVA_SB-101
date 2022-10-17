package com.q3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		MyCallable[] numbers= {
		new MyCallable(10),	
		new MyCallable(11),	
		new MyCallable(12),	
		new MyCallable(13),	
		new MyCallable(14),	
		new MyCallable(15),	
		};
		
		ExecutorService service=Executors.newFixedThreadPool(3);
		
		for(MyCallable y:numbers) {
			Future f=service.submit(y);
			System.out.println(f.get());
		}
		
		service.shutdown();

	}

}
