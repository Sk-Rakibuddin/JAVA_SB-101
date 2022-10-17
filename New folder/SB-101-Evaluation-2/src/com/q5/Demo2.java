package com.q5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;



public class Demo2 {
	
	
	
public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

	ObjectInputStream ois=new ObjectInputStream(new FileInputStream("studentdata.txt"));
	
	List<Student> list=(List<Student>)ois.readObject();
	
	list.forEach(System.out::println);

	
	
	list.add(new Student("she",11,439,"bbb@gmail.com","301",new Address("Tamilnadu","Chennai","4048545")));

	
	
	
	FileOutputStream fo=new FileOutputStream("studentdata.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fo);
	
	oos.writeObject(list);
	System.out.println("done....");
	
	
}


}
