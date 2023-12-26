package com.example.demo.service;

import com.example.demo.dao.entities.Book;
import com.example.demo.service.dtos.BookDTO;

import java.util.List;

public interface BookManager {
    List<BookDTO> getBookByTitle(String title);
    List<BookDTO> getBookByPublisherAmdPrice(String publisher,double price);
    BookDTO saveBook(BookDTO bookDTO);
    BookDTO deleteBook(Long id);
}
