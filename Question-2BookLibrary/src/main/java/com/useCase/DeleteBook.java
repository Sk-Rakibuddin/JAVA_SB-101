package com.useCase;

import com.Dao.BookDao;
import com.Dao.BookDaoImpl;

public class DeleteBook {
    public static void main(String[] args) {
        BookDao dao= new BookDaoImpl();
        dao.deleteBook(7);
        System.out.println("deleted successfully");
    }
}
