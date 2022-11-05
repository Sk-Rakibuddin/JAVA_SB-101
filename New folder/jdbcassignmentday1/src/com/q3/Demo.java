package com.q3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {

	public static void main(String[] args) {

  try {
	Class.forName("com.mysql.cj.jdbc.Driver");
} catch (ClassNotFoundException e) {
	
	e.printStackTrace();
}
  
  String url="jdbc:mysql://localhost:3306/sb101";
  
  try(Connection con=DriverManager.getConnection(url,"root","Rakib@7672")) {
	
	if(con!=null) {
		System.out.println("connected");
		
	}
	else
		System.out.println("not connected");
} catch (SQLException e) {
	
	e.printStackTrace();
}
  
  
  
  
  
  

	}

}
