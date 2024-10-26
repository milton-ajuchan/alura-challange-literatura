package com.aluracursos.javaLiteratura.service;

import com.aluracursos.javaLiteratura.repository.AuthorRepository;
import com.aluracursos.javaLiteratura.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> listAllAuthors() {
        return (List<Author>) authorRepository.findAll();
    }

    public List<Author> listLivingAuthors(int year) {
        // Implementa la lógica para listar autores vivos en el año dado
        return null; // Cambia esto según tu implementación
    }
}
