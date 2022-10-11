package com.q1;

import java.util.Objects;

public class Product {
private int productId;
private String productName;
private int price;
private int quantity;



public Product() {
	super();
	// TODO Auto-generated constructor stub
}



public Product(int productId, String productName, int price, int quantity) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.price = price;
	this.quantity = quantity;
}






public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}





@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
			+ quantity + "]";
}



@Override
public int hashCode() {
	return Objects.hash(price, productId, productName, quantity);
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	return price == other.price && productId == other.productId && Objects.equals(productName, other.productName)
			&& quantity == other.quantity;
}




}
