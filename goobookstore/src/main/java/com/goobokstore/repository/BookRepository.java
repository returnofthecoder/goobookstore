package com.goobokstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.goobokstore.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
