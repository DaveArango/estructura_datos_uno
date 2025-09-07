package edu.uniquindio.co.planificadorimpresiones;

import edu.uniquindio.co.planificadorimpresiones.model.Trabajo;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Trabajo> p = new PriorityQueue<>(Comparator.<Trabajo>naturalOrder()
                .thenComparing((a,b) -> b.getFecha().compareTo(a.getFecha())));
        p.offer(new Trabajo(3, LocalDateTime.of(2025, 8, 7, 16, 0)));
        p.offer(new Trabajo(3, LocalDateTime.now()));
        p.offer(new Trabajo(4, LocalDateTime.of(2025, 8, 7, 16, 0)));
        p.offer(new Trabajo(4, LocalDateTime.of(2025,8,7,16,30)));

        System.out.println(p);
        p.poll();
        System.out.println(p);
        p.poll();
        System.out.println(p);
        p.poll();
        System.out.println(p);
        p.poll();
        System.out.println(p);
    }
}
