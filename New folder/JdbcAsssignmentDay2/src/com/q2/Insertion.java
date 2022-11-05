package com.q2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		for(int i=1; i<=5; i++) {
			System.out.println("Enter id");
			int id=s.nextInt();
			
			System.out.println("enter name");
			String name=s.next();
			
			System.out.println("enter quantity");
			int quantity=s.nextInt();
			
			System.out.println("enter price");
			int price=s.nextInt();
	
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		String url="jdbc:mysql://localhost:3306/sb101";
		
		
		try(Connection con=DriverManager.getConnection(url,"root","Rakib@7672")) {
			
			PreparedStatement ps=con.prepareStatement("insert into product values(?,?,?,?)");
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, quantity);
			ps.setInt(4, price);
			
			int x=ps.executeUpdate();
			if(x>0) {
				System.out.println(i+" item added succesfully");
				
			}
			else {
				System.out.println("Not added");
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		}
		
		
		
		
		
		
		
		
		
		
	}

}
