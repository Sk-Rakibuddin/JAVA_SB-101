package com.q5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;



public class Demo1 {

	public static void main(String[] args) throws IOException {
		
		
         List<Student> list=new ArrayList();
         
list.add(new Student("ravi",12,239,"abc@gmail.com","352",new Address("West Bengal","Kolkata","4048545")));
list.add(new Student("rani",13,259,"ab@gmail.com","372",new Address("Karnataka","Bangalore","4048545")));
list.add(new Student("ram",2,339,"ac@gmail.com","382",new Address("Maharastra","Mumbai","4048545")));
list.add(new Student("hari",14,299,"bc@gmail.com","392",new Address("Delhi","Delhi","4048545")));
list.add(new Student("me",10,439,"bbc@gmail.com","302",new Address("Tamilnadu","Chennai","4048545")));
	


		FileOutputStream fo=new FileOutputStream("studentdata.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fo);
		
		oos.writeObject(list);
		System.out.println("done....");





	}

}
