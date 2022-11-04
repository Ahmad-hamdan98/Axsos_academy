package com.example.demo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Book;
import com.example.demo.services.BookService;

@Controller
public class BookController {

private final BookService bookService;
    
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
	@RequestMapping("/books/{id}")
    public String sh(HttpSession session,@PathVariable("id") Long id) {
		Book book = bookService.findBook(id);
    	session.setAttribute("book", book);
    	return "show.jsp";
    }
}
