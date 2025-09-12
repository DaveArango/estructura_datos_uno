package edu.uniquindio.co.ejercicio17_procesamientoporlotes;

import java.util.ArrayDeque;
import java.util.Deque;

import edu.uniquindio.co.ejercicio17_procesamientoporlotes.Model.Lote;

public class Main {

    public static void main(String[] args) {
        //Arreglo de cola - Array of queue
        Deque<Lote> queue = new ArrayDeque<>();
        
         // Add normal lotes
        queue.addLast(new Lote("Lote 1"));
        queue.addLast(new Lote("Lote 2"));
        queue.addLast(new Lote("Lote 3"));

        // Se Inyecta el lote urgente
        queue.addFirst(new Lote("Lote Urgente A"));

        // Process lotes (desencolar)
        System.out.println("Orden de ejecución de los lotes:");
        while (!queue.isEmpty()) {
            Lote actual = queue.pollFirst(); // desencola del frente
            System.out.println(actual);
        }
    }
}
