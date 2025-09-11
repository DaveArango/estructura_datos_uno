package edu.uniquindio.co.catalogolibros;

import java.util.Comparator;

public class ComparadorAnio implements Comparator<Libro> {

    @Override
    public int compare(Libro l1, Libro l2) {
        return Integer.compare(l1.getAnio(), l2.getAnio());
    }
}
