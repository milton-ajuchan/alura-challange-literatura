package com.aluracursos.javaLiteratura;

import com.aluracursos.javaLiteratura.model.Book;
import com.aluracursos.javaLiteratura.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;
import java.util.Scanner;

@SpringBootApplication
public class JavaLiteraturaApplication {

    @Autowired
    private BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(JavaLiteraturaApplication.class, args);
        new JavaLiteraturaApplication().mostrarMenu();
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1- Buscar libro por título");
            System.out.println("2- Listar libros registrados");
            System.out.println("3- Listar autores registrados");
            System.out.println("4- Listar autores vivos en un determinado año");
            System.out.println("5- Listar libros por idioma");
            System.out.println("6- Salir");

            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    buscarLibroPorTitulo(scanner);
                    break;
                case 2:
                    listarLibros();
                    break;
                case 3:
                    listarAutoresRegistrados();
                    break;
                case 4:
                    listarAutoresVivosEnAnio(scanner);
                    break;
                case 5:
                    listarLibrosPorIdioma(scanner);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            System.out.println();
        } while (opcion != 6);

        scanner.close();
    }

    // Métodos que necesitas implementar para las nuevas opciones
    private void listarAutoresRegistrados() {
        System.out.println("Funcionalidad de listar autores registrados aún no implementada.");
    }

    private void listarAutoresVivosEnAnio(Scanner scanner) {
        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Funcionalidad de listar autores vivos en " + anio + " aún no implementada.");
    }

    private void listarLibrosPorIdioma(Scanner scanner) {
        System.out.print("Ingrese el idioma: ");
        String idioma = scanner.nextLine();
        System.out.println("Funcionalidad de listar libros por idioma '" + idioma + "' aún no implementada.");
    }

    private void listarLibros() {
        Iterable<Book> libros = bookRepository.findAll();
        if (!libros.iterator().hasNext()) {
            System.out.println("No hay libros registrados.");
        } else {
            System.out.println("Lista de libros:");
            for (Book libro : libros) {
                System.out.println(libro.getTitle() + " - " + libro.getAuthor());
            }
        }
    }

    private void buscarLibroPorTitulo(Scanner scanner) {
        System.out.print("Ingrese el título del libro a buscar: ");
        String tituloBuscar = scanner.nextLine();
        Optional<Book> libroOptional = bookRepository.findByTitle(tituloBuscar);
        if (libroOptional.isPresent()) {
            Book libro = libroOptional.get();
            System.out.println("Libro encontrado: " + libro.getTitle() + " por " + libro.getAuthor());
        } else {
            System.out.println("El libro '" + tituloBuscar + "' no se encontró.");
        }
    }
}

