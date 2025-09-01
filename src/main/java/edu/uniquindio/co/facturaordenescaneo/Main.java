package edu.uniquindio.co.facturaordenescaneo;

import edu.uniquindio.co.facturaordenescaneo.model.Detalle;
import edu.uniquindio.co.facturaordenescaneo.model.Supermecado;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Detalle detallePan = Detalle.builder()
                .precio(2000.0)
                .hadIva(false)
                .cantidad(1)
                .build();
        Detalle detalleCamisa = Detalle.builder()
                .precio(50000.0)
                .hadIva(true)
                .iva(0.19f)
                .cantidad(1)
                .build();
        Detalle detalleCerveza = Detalle.builder()
                .precio(5000.0)
                .hadIva(true)
                .iva(0.20f)
                .cantidad(1)
                .build();
        Supermecado supermecado = new Supermecado();
        supermecado.agregarProducto("Pan",  detallePan);
        supermecado.agregarProducto("Camisa",  detalleCamisa);
        supermecado.agregarProducto("Cerveza",  detalleCerveza);
        supermecado.agregarProducto("Pan",   detallePan);

        System.out.println(supermecado.factura());
    }
}
