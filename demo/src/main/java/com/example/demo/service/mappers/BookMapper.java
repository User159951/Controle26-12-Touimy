package com.example.demo.service.mappers;

import com.example.demo.dao.entities.Book;
import com.example.demo.service.dtos.BookDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    private final ModelMapper modelMapper = new ModelMapper();

    public Book fromBookDtoToBook(BookDTO bookDTO){
        return this.modelMapper.map(bookDTO,Book.class);
    }

    public BookDTO fromBookToBookDto(Book book ){
        return this.modelMapper.map(book,BookDTO.class);
    }

}
