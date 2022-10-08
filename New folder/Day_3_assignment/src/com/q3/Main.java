package com.q3;

import java.util.*;

import java.util.stream.*;

import com.q2.Student;

public class Main {

	public static void main(String[] args) {
		
		Map <String,Student> map=new HashMap();
		
		map.put("Kolkata", new Student(2,300,"Akib"));
		map.put("Mumbai", new Student(3,400,"Sakib"));
		map.put("Delhi", new Student(1,500,"Ravi"));
		map.put("Chennai", new Student(4,350,"Hima"));
		map.put("Banagalore", new Student(5,200,"Lrety"));
		
		
		
		
		//Set<Entry<String, Student>> list=map.entrySet();
		

		
		Map<String,Student> sortedMap=map.entrySet().stream().sorted((s1,s2)->
		s2.getValue().getName().compareTo(s1.getValue().getName()))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
		(s1,s2)-> s2, LinkedHashMap::new));
		
		
		
		sortedMap.forEach((key,value)->{
			System.out.println(key+"=="+value.toString());
		});
		
		
	}

}
