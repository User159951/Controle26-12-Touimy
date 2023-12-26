package com.example.demo.service;

import com.example.demo.dao.repository.BookRepository;
import com.example.demo.service.dtos.BookDTO;
import com.example.demo.service.mappers.BookMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class BookManagerAction implements BookManager{

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<BookDTO> getBookByTitle(String title) {
        return bookRepository.findBookByTitre(title).stream().
                map(bookMapper::fromBookToBookDto).
                collect(Collectors.toList());
    }

    @Override
    public List<BookDTO> getBookByPublisherAmdPrice(String publisher, double price) {
        return null;
    }

    @Override
    public BookDTO saveBook(BookDTO bookDTO) {
        return null;
    }

    @Override
    public BookDTO deleteBook(Long id) {
        return null;
    }
}

