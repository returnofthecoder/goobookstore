package com.goobokstore.service;

import java.util.List;

import com.goobokstore.domain.Book;

public interface BookService {

	public List<Book> getAllBooks();

	public Book findBook(Long id);

}
