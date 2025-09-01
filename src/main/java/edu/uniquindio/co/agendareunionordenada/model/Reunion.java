package edu.uniquindio.co.agendareunionordenada.model;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Reunion implements Comparable<Reunion>{
    private LocalDateTime fecha;
    private String asunto;

    @Override
    public int compareTo(Reunion o) {
        return this.fecha.compareTo(o.fecha);
    }
}
