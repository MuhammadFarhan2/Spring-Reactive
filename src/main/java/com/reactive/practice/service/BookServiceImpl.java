package com.reactive.practice.service;

import com.reactive.practice.entity.BookEntity;
import com.reactive.practice.respository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.function.Consumer;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Mono<BookEntity> saveBookEntity(BookEntity book) {
        Mono<BookEntity> createdBook = bookRepository.save(book);
        return createdBook;
    }

    @Override
    public Mono<BookEntity> getBookEntityById(int id) {
        Mono<BookEntity> beFound = bookRepository.findById(id);
        return beFound;
    }

    @Override
    public Mono<Void> deleteBookEntityById(int id) {
        Mono<BookEntity> byId = bookRepository.findById(id);
        Mono<Void> book_can_not_be_deleted = bookRepository.deleteById(id);
        return book_can_not_be_deleted;
    }

    @Override
    public Flux<BookEntity> getAllBookEntitys() {
        return  bookRepository.findAll();
    }

    @Override
    public Mono<BookEntity> updateBookEntity(int id, BookEntity book) {
        Mono<BookEntity> byId = bookRepository.findById(id);
        Mono<Mono<BookEntity>> map = byId.map(data -> bookRepository.save(new BookEntity(data.getId(), data.getTitle(), data.getAuthor())));
        return map.block();
    }
}