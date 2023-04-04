package com.agnyfonseca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agnyfonseca.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
