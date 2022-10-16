package com.q1;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("abc.txt");
		fw.write("Pranab");
		fw.write("\n");
		fw.write("kolkata");
		fw.flush();
		fw.close();
		
		
		
		
		
		
		
		

	}

}
