package edu.uniquindio.co.ejercicio17_procesamientoporlotes.Model;

public class Lote {
    private String id;
   

    public Lote(String id) {
        this.id = id;
       
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return  id;
    }

}