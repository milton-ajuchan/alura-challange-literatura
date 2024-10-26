package com.aluracursos.javaLiteratura.repository;

import com.aluracursos.javaLiteratura.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BookRepository extends CrudRepository<Book, Long> {
    Optional<Book> findByTitle(String title);
    Iterable<Book> findByLanguage(String language);
}
