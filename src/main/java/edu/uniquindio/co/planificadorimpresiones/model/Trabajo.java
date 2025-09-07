package edu.uniquindio.co.planificadorimpresiones.model;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Trabajo implements Comparable<Trabajo>{
    private Integer tamanoImpresion;
    private LocalDateTime fecha;

    @Override
    public int compareTo(Trabajo o) {
        return this.tamanoImpresion.compareTo(o.tamanoImpresion);
    }
}
