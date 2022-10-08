package com.q2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class Main {

	public static void main(String[] args) {
		
		
		Predicate<String> test2=new MyPredicate();
		System.out.println(test2.test("rakib"));
		
		
		
		Predicate<String> test1=s->{
			if(s=="Rakib")
				return true;
			else
				return false;
		};
		System.out.println(test1.test("Rakib"));
		
		
		
//		***********************
		
		
		
		
		Consumer<Student> c=new MyConsumer();
		c.accept(new Student(1,2,"rakib"));
		
		
		Consumer<Student> c1=x->{
		if(x.getMarks()>=0)
			System.out.println("Pass");
		else
			System.out.println("fail");
		};
		
		c1.accept(new Student(2,-1,"rakib"));
		
		
//		*************************************
		
		
		Supplier<String> supp=new MySupplier();
		System.out.println(supp.get());
		
		Supplier<String> sup=()->"Coding";
		System.out.println(sup.get());
		
		
		
//		**********************************
		
		
		Function<Student,String> fun=new MyFunction();
		System.out.println(	fun.apply(new Student(2,34,"tiya")));
	
		Function<Student,String> fun1=s ->{
			if(s.getRoll()==1)
				return "First";
			else
				return "No";
		};
		
		fun1.apply(new Student(1,23,"anupam"));
		
	}

}
