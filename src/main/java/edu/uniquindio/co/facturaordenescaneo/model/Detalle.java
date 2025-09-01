package edu.uniquindio.co.facturaordenescaneo.model;


import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Detalle {
    private Double precio;
    private Boolean hadIva;
    private Integer cantidad;
    @Builder.Default
    private Float iva = 0f;

    @Override
    public String toString() {
        return precio + " | " + hadIva + " | " + cantidad + " | " + iva;
    }
}
