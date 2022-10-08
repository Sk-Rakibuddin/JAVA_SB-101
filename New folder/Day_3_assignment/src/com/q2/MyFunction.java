package com.q2;

import java.util.function.Function;

public class MyFunction  implements Function<Student,String>{

	@Override
	public String apply(Student t) {
		if(t.getRoll()==1)
			return "First Boy";
		else
			return "others";
	}


}
