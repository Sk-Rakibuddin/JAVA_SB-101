package com.q2;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Student> {

	@Override
	public void accept(Student t) {
		if(t.getMarks()>=0)
			System.out.println("Pass");
		else
			System.out.println("fail");
		
	}

}
