package edu.uniquindio.co.ejercicio15_rankingdeportistas;

import java.util.Comparator;
import java.util.TreeSet;

import edu.uniquindio.co.ejercicio15_rankingdeportistas.model.Deportista;

public class Main {
    public static void main(String[] args) {
          Comparator<Deportista> comparator = Comparator
                .comparingInt(Deportista::getScore).reversed() // descendent score
                .thenComparing(Deportista::getLastname)          // ascendent lastname
                .thenComparing(Deportista::getName);           // ascendent name

        TreeSet<Deportista> ranking = new TreeSet<>(comparator);

        ranking.add(new Deportista("Mario", "Albeiro", 90));
        ranking.add(new Deportista("Robinson", "Profesor", 95));
        ranking.add(new Deportista("Luis", "Martinez", 95)); 
        ranking.add(new Deportista("Pedro", "Gomez", 85));
        ranking.add(new Deportista("Maria", "Alvarez", 90));
        ranking.add(new Deportista("Sofia", "Lopez", 90));
        ranking.add(new Deportista("Juan", "Perez", 80));
        ranking.add(new Deportista("Lucia", "Zapata", 100));
        ranking.add(new Deportista("Jorge", "Martinez", 95));
        ranking.add(new Deportista("Camila", "Alvarez", 88));
        ranking.add(new Deportista("Mateo", "Lopez", 92));

         // Show the top 10
        System.out.println("Ranking del Top 10:");
        System.out.println("--------------------------------------------------------------");
        int posicion = 1;
        for (Deportista d : ranking) {
            System.out.println(posicion + ". " + d);
            posicion++;
    
        System.out.println("--------------------------------------------------------------");
            
        }
        
    }
}
