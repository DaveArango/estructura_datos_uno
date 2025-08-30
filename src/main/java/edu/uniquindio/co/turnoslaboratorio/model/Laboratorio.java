package edu.uniquindio.co.turnoslaboratorio.model;

import java.util.LinkedList;

public class Laboratorio {

    LinkedList<String> fila = new LinkedList<>();

    public void ingreso(String nombre){
        fila.addLast(nombre);
    }

    public void ingresoPreferencial(String nombre){
        fila.addFirst(nombre);
    }

    public void salida(){
        fila.removeFirst();
    }

    public void imprimirFila(){
        fila.forEach(System.out::println);
    }
}
