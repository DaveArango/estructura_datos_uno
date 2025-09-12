package edu.uniquindio.co.ejercicio13_cachelrumini;

public class Main {

    public static void main(String[] args) {

           LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");

        System.out.println("Cache inicial: " + cache);

        //Access key 1 → it is promoted
        //Acces key 1 
        cache.get(1);

        // Add another element, you should remove key 2 (the least used) 
        //Agregar otro elemento, debería eliminar la clave 2 (la menos usada)
        cache.put(4, "D");

        System.out.println("Cache final: " + cache);
        

    }
    
}
