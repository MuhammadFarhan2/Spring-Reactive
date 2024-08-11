package com.reactive.practice.service;

import com.reactive.practice.entity.BookEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
public interface BookService {

    public Mono<BookEntity> saveBookEntity(BookEntity book);
    public Mono<BookEntity> getBookEntityById(int id);
    public Mono<Void> deleteBookEntityById(int id);
    public Flux<BookEntity>  getAllBookEntitys();
    public Mono<BookEntity> updateBookEntity(int id, BookEntity book);
    
}
