package com.example.demo.controllers;

import com.example.demo.daos.BookDao;
import com.example.demo.models.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/books")
public class BookController {
    @Autowired
    private BookDao bookDao;

    @RequestMapping(value = "/create")
    public Book create() {
        Book book = new Book();
        book.setId((long) 1);
        book.setName("Flyway 정복하기");
        book.setAuthor("김저자");

        bookDao.save(book);

        return book;
    }
}
