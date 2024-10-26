package com.aluracursos.javaLiteratura.controller;

import com.aluracursos.javaLiteratura.service.BookService;
import com.aluracursos.javaLiteratura.service.AuthorService;
import com.aluracursos.javaLiteratura.model.Author;
import com.aluracursos.javaLiteratura.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class BookController {

    private final BookService bookService;
    private final AuthorService authorService;

    @Autowired
    public BookController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Elija una de las siguientes opciones.");
            System.out.println("1- Buscar libro por título");
            System.out.println("2- Listar libros registrados");
            System.out.println("3- Listar autores registrados");
            System.out.println("4- Listar autores vivos en un determinado año");
            System.out.println("5- Listar libros por idioma");
            System.out.println("6- Salir");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (choice) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String title = scanner.nextLine();
                    // Implementa la lógica para buscar el libro
                    break;
                case 2:
                    List<Book> books = bookService.listAllBooks();
                    if (books.isEmpty()) {
                        System.out.println("No hay libros registrados.");
                    } else {
                        System.out.println("Libros registrados:");
                        for (Book book : books) {
                            System.out.println("- " + book.getTitle());
                        }
                    }
                    break;
                case 3:
                    List<Author> authors = authorService.listAllAuthors();
                    if (authors.isEmpty()) {
                        System.out.println("No hay autores registrados.");
                    } else {
                        System.out.println("Autores registrados:");
                        for (Author author : authors) {
                            System.out.println("- " + author.getName());
                        }
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el año: ");
                    int year = scanner.nextInt();
                    List<Author> livingAuthors = authorService.listLivingAuthors(year);
                    if (livingAuthors.isEmpty()) {
                        System.out.println("No hay autores vivos en el año " + year + ".");
                    } else {
                        System.out.println("Autores vivos en " + year + ":");
                        for (Author author : livingAuthors) {
                            System.out.println("- " + author.getName());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Función aún no implementada.");
                    break;
                case 6:
                    running = false;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida, por favor intente nuevamente.");
            }
        }

        scanner.close();
    }
}

