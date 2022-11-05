package com.q2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Updation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter number for update quantity");
		int x1=s.nextInt();
		
		System.out.println("enter number for update price");
		int x2=s.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/sb101";
		
		try(Connection con=DriverManager.getConnection(url,"root","Rakib@7672")) {
		
			PreparedStatement ps=con.prepareStatement("update product set quantity=quantity+?,price=price+?");
			ps.setInt(1, x1);
			ps.setInt(2, x2);
			int x=ps.executeUpdate();
			
			if(x>0) {
				System.out.println("updated");
			}
			else {
				System.out.println("not updated");
			}
			
			
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
