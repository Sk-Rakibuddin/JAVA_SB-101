package com.q1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class Main {

	public static void main(String[] args) {
		
		Student s1=new Student(2,250,"Ravi");
		Student s2=new Student(2,600,"Amar");
		Student s3=new Student(2,300,"Anupam");
		
		
		
		
		Predicate<Student> test1=s->{
			if(s.getMarks()<500)
				return true;
			else
				return false;
		};
		System.out.println(test1.test(s2));
		
		
		
//		***********************
		
		
		
		
		
		
		
		Consumer<Student> c1=x->{
		System.out.println("name is "+x.getName()+"   "+"marks-"+x.getMarks()+"   "+"roll "+x.getRoll());
		};
		
		c1.accept(new Student(2,250,"Ravi"));
		
		
//		*************************************
		
		
		
		Supplier<Student> sup=()->new Student(2,600,"Amar");
		System.out.println(sup.get());
		
		
		
//		**********************************
		
		
		
	
		Function<String,Integer> fun1=s ->{
			
			int i= (Integer.parseInt(s));
			return i;
		};
		
		System.out.println(fun1.apply("100"));
		
		
	}

}
