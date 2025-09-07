package edu.uniquindio.co.listareproduccioneditable.model;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cancion {
    private String titulo;
    private String descripcion;
}
