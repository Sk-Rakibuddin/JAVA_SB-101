package com.useCase;

import com.Dao.BookDao;
import com.Dao.BookDaoImpl;

public class FindBook {
    public static void main(String[] args) {
        BookDao dao= new BookDaoImpl();
        dao.findBook(7);

    }
}
