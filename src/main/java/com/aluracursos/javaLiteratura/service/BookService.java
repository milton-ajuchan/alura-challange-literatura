package com.aluracursos.javaLiteratura.service;

import com.aluracursos.javaLiteratura.model.Book;
import com.aluracursos.javaLiteratura.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> listAllBooks() {
        return (List<Book>) bookRepository.findAll();
    }
}

