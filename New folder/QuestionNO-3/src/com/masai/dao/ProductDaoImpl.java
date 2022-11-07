package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.exceptions.ProductException;

import com.masai.model.Product;

import com.masai.utility.DBUtil;

public class ProductDaoImpl implements ProductDao{

	@Override
	public String addProduct(Product product) {
		
		String msg="not inserted";
		
		try(Connection con=DBUtil.provideConnection()) {
		
			PreparedStatement ps=con.prepareStatement("insert into product values(?,?,?,?)");
			ps.setInt(1,product.getProductId());
			ps.setString(2, product.getProductName());
			ps.setInt(3, product.getPrice());
			ps.setInt(4, product.getQuantity());
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				msg="Inserted Successfully";
			}
			
			
			
		}
		catch(SQLException e) {
			msg=e.getMessage();
		}
		
		
		
		return msg;
	}
	
	
	
@Override
	public List<Product> getAllProducts() throws ProductException {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<>();
		
		

		try(Connection con= DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= con.prepareStatement("select * from product");
			
			
			ResultSet rs= ps.executeQuery();
			
			
			while(rs.next()) {
				
				
				int r= rs.getInt("productId");
				String n= rs.getString("productName");
				int m= rs.getInt("price");
				int o=rs.getInt("quantity");
				
				
				Product product = new Product(r, n, m,o);
				
				products.add(product);
				
				
				
			}
			
			} catch (SQLException e) {
			
			throw new ProductException(e.getMessage());
		}
		
		
		if(products.size() == 0)
			throw new ProductException("No Student found");
		
		
		
		
		return products;
	}



@Override
public List<Product> getAllProductQuantityLessThan(int quantity) throws ProductException {
	
	List<Product> products = new ArrayList<>();
	
	

	try(Connection con= DBUtil.provideConnection()) {
		
		
		PreparedStatement ps= con.prepareStatement("select * from product where quantity<?");
		ps.setInt(1, quantity);
		
		ResultSet rs= ps.executeQuery();
		
		
		while(rs.next()) {
			
			
			int r= rs.getInt("productId");
			String n= rs.getString("productName");
			int m= rs.getInt("price");
			int o=rs.getInt("quantity");
			
			
			Product product = new Product(r, n, m,o);
			
			products.add(product);
			
			
			
		}
		
		} catch (SQLException e) {
		
		throw new ProductException(e.getMessage());
	}
	
	
	if(products.size() == 0)
		throw new ProductException("No Student found");
	
	
	
	
	return products;
}



@Override
public Product getProductByProductName(String pname) throws ProductException {
	
	Product product=null;
try(Connection con= DBUtil.provideConnection()) {
		
		
		PreparedStatement ps= con.prepareStatement("select * from product where productName=?");
		ps.setString(1, pname);
		
		ResultSet rs= ps.executeQuery();
		
		
		while(rs.next()) {
			
			
			int r= rs.getInt("productId");
			String n= rs.getString("productName");
			int m= rs.getInt("price");
			int o=rs.getInt("quantity");
			
			
			product = new Product(r, n, m,o);
			
			
			
			
		}
		
		} catch (SQLException e) {
		
		throw new ProductException(e.getMessage());
	}
	
	
	
	
	
	
	
	return product;
}





@Override
public String addProductQuantity(int productId, int Quantity) throws ProductException {
	String msg="not inserted";
	
	try(Connection con=DBUtil.provideConnection()) {
		
		PreparedStatement ps=con.prepareStatement("insert into product values(?,null,null,?)");
		ps.setInt(1,productId);
		
		ps.setInt(4, Quantity);
		
		int x=ps.executeUpdate();
		
		if(x>0) {
			msg="Inserted Successfully";
		}
		
		
		
	}
	catch(SQLException e) {
		msg=e.getMessage();
	}
	
	return msg;
}








@Override
public String deleteProductByProductName(String pname) throws ProductException {
	String msg="not deleted";
	
	
try(Connection con= DBUtil.provideConnection()) {
		
		
		PreparedStatement ps= con.prepareStatement("delete from product where productName=?");
		ps.setString(1, pname);
		
		int x= ps.executeUpdate();
		if(x>0)
		msg="deleted successfully";
		
		
		} catch (SQLException e) {
		
		throw new ProductException(e.getMessage());
	}
	
	return msg;
}

}
