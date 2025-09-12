package edu.uniquindio.co.ejercicio19_indiceinvertidosimple;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class IndiceInvertido {
    /**
     * key = word (string), Value = Collection of pages (numbers of pages), 
     * es decir numero de paginas donde se encuentra la palabra
    **/
    private HashMap<String, TreeSet<Integer>> indice;

    public IndiceInvertido() {
        indice = new HashMap<>();
    }

    //Add word concurrency on a page
    public void add(String palabra, int pagina) {
        indice.computeIfAbsent(palabra, k -> new TreeSet<>()).add(pagina);
    }

    // Consult pages for a key-word and return the pages where the given it
    public Set<Integer> getPages(String palabra) {
        return indice.getOrDefault(palabra, new TreeSet<>());
    }

    @Override
    public String toString() {
        return indice.toString();
    }
}
    