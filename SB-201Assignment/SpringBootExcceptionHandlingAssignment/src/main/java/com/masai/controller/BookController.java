package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.book.Book;
import com.masai.exception.BookNotFoundException;

import jakarta.annotation.PostConstruct;

@RestController
public class BookController {

	
private List<Book> books=new ArrayList();


@PostConstruct
public void addItem() {

	books.add(new Book(1,"Mechanics","Agarwall",600));
	books.add(new Book(2,"Electronics","J.Roy",400));
	books.add(new Book(3,"Physics","S.Shukla",500));
	books.add(new Book(4,"C.S","D.Mathur",700));
	books.add(new Book(5,"Quantum","Chatterjee",800));
	
}

@GetMapping("/books")
public ResponseEntity<List<Book>> getAllItem() throws BookNotFoundException{
	if(books.size()==0) {
		throw new BookNotFoundException("No data added");
	}
	
	return new ResponseEntity<List<Book>> (books,HttpStatus.OK);
}




@GetMapping("/books/{i}")
public ResponseEntity<Book> getOneItemById(@PathVariable("i") Integer id) throws BookNotFoundException{
  Book book=null;

    for (int i=0; i<books.size();i++) {
    	if(books.get(i).getBookId()==id) {
    		book=books.get(i);
    	}
    }
    if(book!=null) {
    	return new ResponseEntity<Book>(book,HttpStatus.OK);
    }
    else throw new BookNotFoundException("Book not found with id "+id);
}

@PostMapping("/books")
public ResponseEntity<Book> registerBook(@RequestBody Book book) throws BookNotFoundException{
	
	
	books.add(book)	;
	
	return new ResponseEntity<Book>(book,HttpStatus.OK);
	
}


@DeleteMapping("/books/{id}")
public ResponseEntity<Book> deleteBook(@PathVariable("id") Integer Id) throws BookNotFoundException{
	Book b=null;
	for(int i=0; i<books.size();i++) {
		if(books.get(i).getBookId()==Id) {
			b=books.remove(i);
		}
	}
	if(b==null) {
		throw new BookNotFoundException("Invalid Request not found");
	}
	return new ResponseEntity<Book>(b,HttpStatus.OK);
}


@PutMapping("/books/{id}")
public ResponseEntity<Book> updateBook(@RequestBody Book book,@PathVariable("id") Integer Id) throws BookNotFoundException{
	boolean f=false;
	
	for(int i=0; i<books.size(); i++) {
		if(books.get(i).getBookId()==Id) {
			books.get(i).setBookId(Id);
			books.get(i).setName(book.getName());
			books.get(i).setAuthor(book.getAuthor());
			books.get(i).setPrice(book.getPrice());
			
			f=true;
		}
	}
	if(f==true)
	return new ResponseEntity<Book>(book,HttpStatus.OK);
	
	else throw new BookNotFoundException("book does not found with this id");
}


	
}
