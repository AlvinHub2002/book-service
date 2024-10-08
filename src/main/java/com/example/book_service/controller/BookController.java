package com.example.book_service.controller;

import com.example.book_service.entity.BookEntity;
import com.example.book_service.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    BookRepo bookrepo;

    @GetMapping("/books")
    public List<BookEntity> getAllBooks(){
        return this.bookrepo.findAll();
    }

    @GetMapping("/books/{bid}")
    public Optional<BookEntity> getBook(@PathVariable int bid){
        return this.bookrepo.findById(bid);
    }

    @PostMapping("/books")
    public BookEntity addBook(@RequestBody BookEntity newbook){
        return this.bookrepo.saveAndFlush(newbook);
    }

}
