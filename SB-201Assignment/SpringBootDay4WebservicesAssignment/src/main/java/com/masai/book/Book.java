package com.masai.book;

public class Book {
	
private Integer bookId;
private String name;
private String author;
private String publication;
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(Integer bookId, String name, String author, String publication) {
	super();
	this.bookId = bookId;
	this.name = name;
	this.author = author;
	this.publication = publication;
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
public String getPublication() {
	return publication;
}
public void setPublication(String publication) {
	this.publication = publication;
}
@Override
public String toString() {
	return "Book [bookId=" + bookId + ", name=" + name + ", author=" + author + ", publication=" + publication + "]";
}


	
	
	
}
