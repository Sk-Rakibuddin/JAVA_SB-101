package com.q2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		ExecutorService service=Executors.newFixedThreadPool(4);

		Job[] job= {
		new Job("Ravi"),
		new Job("Rakesh"),
		new Job("anu"),
		new Job("Modon")
		};
		
		for(Job s:job) {
			service.submit(s);
		}
		service.shutdown();
		
		
		
	}

}
