/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.llh.h2.controller;

import com.llh.h2.domain.Book;
import com.llh.h2.service.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lorenzolince
 */
@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void save(@RequestBody Book book) {
        System.out.println("####### SAVE ############");
        bookService.save(book);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Book> getAllBook() {
         System.out.println("####### getAllBook ############");
        return bookService.getAllBook();
    }

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public Book gertById(@RequestParam(name = "id", required = true) Long id) {
         System.out.println("####### gertById ############");
        return bookService.gertById(id);
    }
}
