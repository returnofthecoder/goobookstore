package com.goobokstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.goobokstore.domain.Book;
import com.goobokstore.repository.BookRepository;

//@Service("bookService")
@Service
@Transactional
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> getAllBooks() {
		return (List<Book>) bookRepository.findAll();
	}

	@Override
	public Book findBook(Long id) {
		return bookRepository.findOne(id);
	}

}
