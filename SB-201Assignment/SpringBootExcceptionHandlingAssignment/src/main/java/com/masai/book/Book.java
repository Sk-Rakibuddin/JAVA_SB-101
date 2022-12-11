package com.masai.book;

public class Book {
private Integer bookId;
private String name;
private String author;
private Integer price;
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(Integer bookId, String name, String author, Integer price) {
	super();
	this.bookId = bookId;
	this.name = name;
	this.author = author;
	this.price = price;
}
public Integer getBookId() {
	return bookId;
}
public void setBookId(Integer bookId) {
	this.bookId = bookId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public Integer getPrice() {
	return price;
}
public void setPrice(Integer price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [bookId=" + bookId + ", name=" + name + ", author=" + author + ", price=" + price + "]";
}


	
	
	
}
