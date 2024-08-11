package com.reactive.practice.controller;

import com.reactive.practice.entity.BookEntity;
import com.reactive.practice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/")
    public Mono<BookEntity> saveBookEntityMono(@RequestBody BookEntity bookEntity){
       return bookService.saveBookEntity(bookEntity);
    }

    @GetMapping("/")
    public Mono<BookEntity> getBookEntityById(@RequestParam int id){
        return bookService.getBookEntityById(id);
    }

    @GetMapping("/all")
    public Flux<BookEntity> getAllBooks() {
        return bookService.getAllBookEntitys();
    }

    @DeleteMapping("/")
    public Mono<Void> deleteBookEntityById(@RequestParam int id){
        return bookService.deleteBookEntityById(id);
    }
}
