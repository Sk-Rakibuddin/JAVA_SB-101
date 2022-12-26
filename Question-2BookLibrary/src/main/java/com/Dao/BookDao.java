package com.Dao;

import com.model.Book;

public interface BookDao {
    public String createBook(Book book);
    public String findBook(int id);
    public  String updateBook(int id);
    public  String deleteBook(int id);

}
