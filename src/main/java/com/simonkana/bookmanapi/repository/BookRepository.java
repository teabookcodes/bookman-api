package com.simonkana.bookmanapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simonkana.bookmanapi.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContaining(String title);
}

