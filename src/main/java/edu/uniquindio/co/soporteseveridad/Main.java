package edu.uniquindio.co.soporteseveridad;

import edu.uniquindio.co.soporteseveridad.model.Ticket;
import edu.uniquindio.co.soporteseveridad.services.Severidad;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Ticket> tickets = new PriorityQueue<>(Comparator.<Ticket>naturalOrder()
                .thenComparing(Ticket::getFecha));
        Ticket karen = Ticket.builder()
                .severidad(Severidad.BAJA)
                .fecha(LocalDateTime.of(2025,8,30,22,0))
                .build();
        Ticket patricia = Ticket.builder()
                .severidad(Severidad.MEDIA)
                .fecha(LocalDateTime.of(2025,8,30,22,0))
                .build();
        Ticket brayan = Ticket.builder()
                .severidad(Severidad.CRITICA)
                .fecha(LocalDateTime.of(2025,8,30,23,2))
                .build();
        Ticket yurani = Ticket.builder()
                .severidad(Severidad.CRITICA)
                .fecha(LocalDateTime.of(2025,8,30,23,0))
                .build();

        tickets.offer(karen);
        tickets.offer(patricia);
        tickets.offer(brayan);
        tickets.offer(yurani);

        System.out.println(tickets.poll());
        System.out.println(tickets.poll());
        System.out.println(tickets.poll());
        System.out.println(tickets.poll());
    }
}
