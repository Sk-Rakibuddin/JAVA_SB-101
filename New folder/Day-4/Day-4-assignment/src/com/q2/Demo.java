package com.q2;
import java.util.*;


import java.util.Comparator;
public class Demo {

	public static void main(String[] args) {
		
		Student s1=new Student(2,250,"Ravi");
		Student s2=new Student(2,600,"Amar");
		Student s3=new Student(2,300,"Anupam");
		List<Student> list=Arrays.asList(s1,s2,s3);
		
		Comparator<Student> comparator = Comparator.comparing( Student::getMarks );
		 
		
		Student minObject = list.stream().min(comparator).get();
		Student maxObject = list.stream().max(comparator).get();
		
		System.out.println(minObject);
	}

}
