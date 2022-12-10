package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.book.Book;

import jakarta.annotation.PostConstruct;

@RestController
public class MyController {

	private List<Book> book=new ArrayList();
	
	@PostConstruct
	public void addItem() {
		book.add(new Book(1,"abc","Ram","mcg"));
		book.add(new Book(2,"cbc","Shyam","acg"));
		book.add(new Book(3,"vbc","Rakib","bcg"));
		book.add(new Book(4,"xbc","Raja","ocg"));
		book.add(new Book(5,"nbc","Rafik","kcg"));
		
	}
	
	
	@GetMapping("/books")
	public List<Book> getAll(){
		
		return book;
	}
	
	@PostMapping("/books")
	public Book registerBook(@RequestBody Book b) {
		book.add(b);
		return b;
	}
	
	@GetMapping("/books/{id}")
	public Book getBookBybookId(@PathVariable("id") Integer bookId) {
		Book b=null;
		
		for(Book books:book) {
			if(books.getBookId()==bookId) {
				b=books;
			}
		}
		if(b!=null)
		return b;
		else
			throw new IllegalArgumentException
			("book does not exist with bookid "+bookId);
	}
	
	
	
	@DeleteMapping("/books/{id}")
	public String deleteBook(@PathVariable("id") Integer Id) {
		
		boolean x=false;
		for(int i=0; i<book.size();i++) {
			if(book.get(i).getBookId()==Id) {
				
				book.remove(i);
				x=true;
				break;
			}
		}
		
		
		if(x==true)
			return "Book Deleted successfully";
		else
			throw new IllegalArgumentException("book not found");
	}
	
	
	
	@PutMapping("/books/{id}")
	public Book updateBook(@RequestBody Book b,@PathVariable("id") Integer Id) {
	
		boolean f=false;
		
		
	for(int i=0; i<book.size();i++) {
		if(book.get(i).getBookId()==Id) {
			Book existBook=book.get(i);
			
			existBook.setName(b.getName());
			existBook.setAuthor(b.getAuthor());
			existBook.setPublication(b.getPublication());
			
			f=true;
		}
	}
	if(f==true) {
		return b;
	}
	else throw new IllegalArgumentException("Book not found");
		
		
		
	}
	
	
	
}
