package edu.uniquindio.co.ejercicio19_indiceinvertidosimple;

 //Profe se pratico tambien un poco el programar en ingles

public class Main {
    public static void main(String[] args) {
         IndiceInvertido index = new IndiceInvertido();

        // Agregar palabras con páginas - add words with pages
        index.add("Pais", 1);
        index.add("Pais", 3);
        index.add("Pais", 5);

        index.add("Colombia", 2);
        index.add("Colombia", 3);

        index.add("Pais", 4);
        index.add("Venezuela", 1);
        index.add("Venezuela", 1); // duplicado, se ignora, ya que el hashmap y tree set no permiten duplicados
    

        // Consult words
        System.out.println("Páginas de 'Pais': " + index.getPages("Pais"));
        System.out.println("Páginas de 'Colombia': " + index.getPages("Colombia"));
        System.out.println("Páginas de 'Venezuela': " + index.getPages("Venezuela"));

        // Show all index
        System.out.println("\nÍndice completo: " + index);
    }
}