package com.useCase;

import com.Dao.BookDao;
import com.Dao.BookDaoImpl;

public class UpdateBook {
    public static void main(String[] args) {
        BookDao dao= new BookDaoImpl();
        dao.updateBook(7);
        System.out.println("done");
    }
}
