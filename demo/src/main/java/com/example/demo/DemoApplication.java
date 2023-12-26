package com.example.demo;

import com.example.demo.dao.entities.Book;
import com.example.demo.dao.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(BookRepository bookRepository){
        return args -> {
            List<Book> books = List.of(
                    Book.builder().titre("test").price(12).build(),
                    Book.builder().titre("test").price(12).build(),
                    Book.builder().titre("test").price(12).build(),
                    Book.builder().titre("test").price(12).publisher("sqd").build()
            );

            bookRepository.saveAll(books);
        };
    }
}
