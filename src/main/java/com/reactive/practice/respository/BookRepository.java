package com.reactive.practice.respository;

import com.reactive.practice.entity.BookEntity;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends ReactiveCrudRepository<BookEntity, Integer> {
}
