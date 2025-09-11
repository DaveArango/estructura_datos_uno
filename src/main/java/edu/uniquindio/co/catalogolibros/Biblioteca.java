package edu.uniquindio.co.catalogolibros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregar(Libro libro){
        libros.add(libro);
    }

    public void eliminar(int isbn){
        for(int i= 0; i<libros.size(); i++){
            if (libros.get(i).getIsbn()==isbn){
                libros.remove(libros.get(i));
            }
        }
    }

    public Libro buscarAutor(String autor){
        for(int i= 0; i<libros.size(); i++){
            if (libros.get(i).getAutor()== autor){
                return libros.get(i);
            }
        }

        return null;
    }

    public List<Libro> listarPorAnio() {
        List<Libro> copia = new ArrayList<>(libros);
        Collections.sort(copia, new ComparadorAnio());
        return copia;
    }


    public List<Libro> obtener5MasRecientes() {
        List<Libro> copia = new ArrayList<>(libros);
        Collections.sort(copia, new ComparadorAnio());
        int size = copia.size();
        if (size <= 5) {
            return copia;
        }
        return copia.subList(size - 5, size);
    }


}
