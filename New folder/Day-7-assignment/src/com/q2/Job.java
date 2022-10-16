package com.q2;

public class Job implements Runnable{
  String name;


Job(String name) {
	this.name=name;
}
 
 
	@Override
	public void run() {
		System.out.println(name+"  "+Thread.currentThread().getName());
		
	}

}
