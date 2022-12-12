package com.masai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity

public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer productId;
	
	@Size(min=3,max=16,message="name should be between 3 to 16 chars")
	@NotNull(message="name field is mandatory")
	@NotBlank(message="name field is mandatory")
	@NotEmpty(message="name field is mandatory")
	private String productName;
	
	@NotNull(message="quantity field is mandatory")
	
	@Min(value=1,message="quantity should be greater than zero")
	private Integer quantity;
	
	@NotNull(message="price field is mandatory")
	
	private Double price;
	
	@NotNull(message="Category field is mandatory")
	@NotBlank(message="Category field is mandatory")
	@NotEmpty(message="Category field is mandatory")
	private String category;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product( String productName, Integer quantity, Double price, String category) {
		super();
		
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.category = category;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity
				+ ", price=" + price + ", category=" + category + "]";
	}
	
	
	
	
	
}
