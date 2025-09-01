package edu.uniquindio.co.conteoconcurrentesimple.model;

import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;

public class Registro extends Thread{
    Hashtable<String, Integer> registros = new Hashtable<>();
    //Se implementa un Hashtable porque soporta hilos, sin embargo, es recomendable usar
    //ConcurrentHashMap, es más moderno

    public synchronized  void registrar(String nombre){
        registros.merge(nombre, 1, Integer::sum );
    }

    public void topTres(){
        registros.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(3)
                .toList()
                .forEach(System.out::println);
    }
}
