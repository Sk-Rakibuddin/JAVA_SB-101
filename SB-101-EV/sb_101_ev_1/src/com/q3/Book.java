package com.q3;

public class Book {
private int isbn;
private String Author;
private String bookName;
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(int isbn, String author, String bookName) {
	super();
	this.isbn = isbn;
	Author = author;
	this.bookName = bookName;
}
public int getIsbn() {
	return isbn;
}
public void setIsbn(int isbn) {
	this.isbn = isbn;
}
public String getAuthor() {
	return Author;
}
public void setAuthor(String author) {
	Author = author;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
@Override
public String toString() {
	return "Book [isbn=" + isbn + ", Author=" + Author + ", bookName=" + bookName + "]";
}


}
