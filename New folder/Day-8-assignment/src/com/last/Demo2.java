package com.last;
import java.io.*;
import java.util.List;
public class Demo2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("studentdata.txt"));
		
		List<Student> list=(List<Student>)ois.readObject();
		
		list.forEach(System.out::println);

	}

}
