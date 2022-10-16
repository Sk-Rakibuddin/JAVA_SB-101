package com.q1;

public class Demo extends Thread{
int x=1;	
@Override	
public void run() {
	
	synchronized (this) {
		for(int i=1;i<=10;i++) {
			x*=i;
		}
	
	
	this.notify();}
}


}
