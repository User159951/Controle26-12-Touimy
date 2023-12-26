package com.example.demo.web;

import com.example.demo.service.BookManager;
import com.example.demo.service.dtos.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookGraphQlController {
    @Autowired
    private BookManager bookManager;

    @QueryMapping
    List<BookDTO> getBookByTitle(@Argument String title){
        return bookManager.getBookByTitle(title);
    }

    @QueryMapping
    List<BookDTO> getBookByPublisherAmdPrice(@Argument String publisher,@Argument double price){
        return bookManager.getBookByPublisherAmdPrice(publisher, price);
    }

    @MutationMapping
    BookDTO saveBook(@Argument BookDTO bookDTO){
        return bookManager.saveBook(bookDTO);
    }

    @MutationMapping
    BookDTO deleteBook(@Argument Long id) {
        return bookManager.deleteBook(id);
    }
}