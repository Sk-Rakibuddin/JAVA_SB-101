package com.q2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Deletion {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/sb101";
		
		try(Connection con=DriverManager.getConnection(url,"root","Rakib@7672")) {
		
		PreparedStatement ps =con.prepareStatement("delete from product where quantity<2");
		int x=ps.executeUpdate();
		
		if(x>0) {
			System.out.println(x+" item deleted");
		}
		else {
			System.out.println("not deleted");
		}
		
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
