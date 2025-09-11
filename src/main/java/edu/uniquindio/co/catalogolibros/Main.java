package edu.uniquindio.co.catalogolibros;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregar(new Libro("Cien Años de Soledad", "García Márquez", 1967, 1234));
        biblioteca.agregar(new Libro("Rayuela", "Cortázar", 1963, 5678));
        biblioteca.agregar(new Libro("La sombra del viento", "Zafón", 2001, 2345));
        biblioteca.agregar(new Libro("El nombre de la rosa", "Eco", 1980, 3456));
        biblioteca.agregar(new Libro("1984", "Orwell", 1949, 7890));
        biblioteca.agregar(new Libro("Sapiens", "Harari", 2011, 54321));


        System.out.println(" Libros ordenados por año:");
        biblioteca.listarPorAnio().forEach(System.out::println);

        System.out.println("\n Los 5 más recientes:");
        biblioteca.obtener5MasRecientes().forEach(System.out::println);

        System.out.println(" \n Libro por autor: ");
        Libro libro = biblioteca.buscarAutor("Eco");
        System.out.println("libro del autor: "+ libro.getAutor()+ " es: " +libro);
    }
}
