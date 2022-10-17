package com.q4;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		DhoniThread dhoni=new DhoniThread();
		KohliThread kohli=new KohliThread();
		RohitThread rohit=new RohitThread();
		
		dhoni.setPriority(10);
		dhoni.start();
		kohli.start();
		rohit.start();
		dhoni.join();
		rohit.join();
		

	}

}
