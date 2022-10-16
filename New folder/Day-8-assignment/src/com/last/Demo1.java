package com.last;
import java.io.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		List<Student> list=new ArrayList();
		list.add(new Student("ravi",12,239,new Address("West Bengal","Kolkata","4048545")));
		list.add(new Student("rani",13,259,new Address("West Bengal","Kolkata","4048545")));
		list.add(new Student("ram",2,339,new Address("West Bengal","Kolkata","4048545")));
		list.add(new Student("hari",14,299,new Address("West Bengal","Kolkata","4048545")));
		list.add(new Student("me",10,439,new Address("West Bengal","Kolkata","4048545")));
		
		
		//System.out.println(list);
		FileOutputStream fo=new FileOutputStream("studentdata.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fo);
		
		oos.writeObject(list);
		System.out.println("done....");
		
		
		

	}

}
