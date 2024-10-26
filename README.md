## Java Literatura Application
Descripción
La Java Literatura Application es una herramienta diseñada para gestionar un catálogo de libros y autores, permitiendo a los usuarios agregar, listar y buscar libros en una base de datos. La aplicación utiliza Spring Boot para la construcción de un backend eficiente y escalable, y se conecta a una base de datos PostgreSQL para el almacenamiento persistente de datos.

## Funcionalidades
La aplicación cuenta con las siguientes funcionalidades:

Agregar un libro: Permite al usuario ingresar detalles sobre un nuevo libro, incluyendo título, autor, idioma y cantidad de descargas, que se almacenan en la base de datos.

Listar libros registrados: Ofrece la opción de mostrar todos los libros almacenados en la base de datos, presentando el título y autor de cada uno.

Buscar libro por título: Facilita la búsqueda de un libro específico mediante su título, mostrando la información correspondiente si se encuentra en la base de datos.

Listar autores registrados: Permite al usuario ver todos los autores que han sido registrados en la aplicación.

Listar autores vivos en un año determinado: Ofrece la posibilidad de filtrar y mostrar autores que están vivos en un año específico, proporcionando una visión clara de la relevancia contemporánea de los autores.

Listar libros por idioma: Permite a los usuarios filtrar libros según el idioma en que están escritos, facilitando la búsqueda de obras en un idioma específico.

## Tecnologías Utilizadas
Java 17: Lenguaje de programación utilizado para el desarrollo de la aplicación.
Spring Boot: Framework que simplifica el desarrollo de aplicaciones en Java, proporcionando herramientas para la creación de servicios RESTful y la gestión de dependencias.
Spring Data JPA: Proporciona acceso a bases de datos a través de la creación de repositorios de manera sencilla y eficiente.
PostgreSQL: Sistema de gestión de bases de datos relacional utilizado para el almacenamiento de datos.
HikariCP: Un conjunto de conexiones de base de datos que proporciona un acceso rápido y eficiente a la base de datos.
Requisitos
JDK 17 o superior
PostgreSQL
Dependencias de Maven definidas en el archivo pom.xml
