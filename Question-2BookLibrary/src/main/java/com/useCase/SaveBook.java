package com.useCase;

import com.Dao.BookDao;
import com.Dao.BookDaoImpl;
import com.model.Book;

import java.time.LocalDateTime;

public class SaveBook {
    public static void main(String[] args) {
        BookDao dao= new BookDaoImpl();
        Book b=new Book("Physics","H.c.Verma","mgh","12th standard",500,650, LocalDateTime.now());
        dao.createBook(b);
    }
}
