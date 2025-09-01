package edu.uniquindio.co.soporteseveridad.model;

import edu.uniquindio.co.soporteseveridad.services.Severidad;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Ticket implements Comparable<Ticket>{
    private Severidad severidad;
    private LocalDateTime fecha;

    @Override
    public int compareTo(Ticket o) {
        return this.severidad.ordinal() - o.severidad.ordinal();
    }
}
