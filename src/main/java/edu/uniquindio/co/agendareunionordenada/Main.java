package edu.uniquindio.co.agendareunionordenada;

import edu.uniquindio.co.agendareunionordenada.model.Reunion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Reunion reunion1 = Reunion.builder()
                .fecha(LocalDateTime.now())
                .asunto("Charla con la secretaria")
                .build();
        Reunion reunion2 = Reunion.builder()
                .fecha(LocalDateTime.of(2025,12,30,8,20))
                .asunto("Charla con la policia")
                .build();
        Reunion reunion3 = Reunion.builder()
                .fecha(LocalDateTime.of(2025,12,30,15,20))
                .asunto("Charla con la direccion")
                .build();
        Reunion reunion4 = Reunion.builder()
                .fecha(LocalDateTime.of(2025,12,31,15,20))
                .asunto("Charla con la junta")
                .build();
        TreeSet<Reunion> reuniones = new TreeSet<>();
        reuniones.add(reunion1);
        reuniones.add(reunion4);
        reuniones.add(reunion2);
        reuniones.add(reunion3);
        reuniones.forEach(System.out::println);
        System.out.println("--------------------------");
        reuniones.subSet(reunion2, reunion4).forEach(System.out::println);
        System.out.println("--------------------------");
        reuniones.subSet(reunion2, true, reunion4, true)
                .forEach(System.out::println);
    }
}
