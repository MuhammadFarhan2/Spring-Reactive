package com.reactive.practice.entity;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


// This entity represents a book in our database.
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table("BOOK")
public class BookEntity {
    @Id
    int id;
    String title;
    String author;
}