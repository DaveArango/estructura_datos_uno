package edu.uniquindio.co.listareproduccioneditable.model;

import lombok.*;

import java.util.LinkedList;
import java.util.ListIterator;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Reproductor {
    private LinkedList<Cancion> canciones = new LinkedList<>();
    private int cursor = -1;

    public void listarCanciones(){
        ListIterator<Cancion>  listIterator = canciones.listIterator();
        while(listIterator.hasNext()){
            Cancion cancion = listIterator.next();
            System.out.println(cancion);
        }
    }

    public void addCancion(Cancion cancion){
        ListIterator<Cancion>  listIterator = canciones.listIterator();
        listIterator.add(cancion);
    }

    public void adelantarCancion(){
        if(cursor + 1 < canciones.size()){
            cursor++;
            Cancion actual = canciones.get(cursor);
            System.out.println("Ahora suena: " + actual.getTitulo());
        } else {
            System.out.println("Fin de la lista");
        }
    }

    public void retrocederCancion(){
        if(cursor - 1 >= 0){
            cursor--;
            Cancion actual = canciones.get(cursor);
            System.out.println("Ahora suena: " + actual.getTitulo());
        } else {
            System.out.println("Inicio de la lista");
        }
    }

    public void moverCancion(int from, int to){
        System.out.println("Mover desde posición: " + from);
        System.out.println("A la posición: " + to);

        if(from >=0 && from < canciones.size() && to >=0 && to < canciones.size()){
            Cancion temp = canciones.remove(from);
            canciones.add(to, temp);
            System.out.println("Canción movida.");
            if(cursor == from){
                cursor = to;
            } else if(from < cursor && to >= cursor){
                cursor--;
            } else if(from > cursor && to <= cursor){
                cursor++;
            }
        } else {
            System.out.println("Posiciones inválidas.");
        }
    }
}
