package com.q2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		SortMarks s=new SortMarks();
		
		
		List<Student> list=new ArrayList<> ();
		list.add(new Student(2,234,"Rakib","Kolkata"));
		list.add(new Student(1,134,"Sakib","Mumbai"));
		list.add(new Student(5,234,"shyam","Chennai"));
		list.add(new Student(2,234,"Rakib","Kolkata"));
		
		System.out.println(list);
		
		Set<Student> set=new LinkedHashSet<> (list);
		
		list=new ArrayList(set);
		
		list.sort(s);
		for(Student st:list)
		System.out.println(st);
		
	
		
	}
	
}
