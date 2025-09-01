package edu.uniquindio.co.facturaordenescaneo.model;

import lombok.Getter;

import java.util.*;

public class Supermecado {
    @Getter
    private LinkedHashMap<String, Detalle> productos  = new LinkedHashMap<>();

    public void agregarProducto(String nombre,
                         Detalle nuevoDetalle) {
        Detalle existente = getProductos().get(nombre);
        if (existente == null) {
            getProductos().put(nombre, nuevoDetalle);
        } else {
            existente.setCantidad(existente.getCantidad() + nuevoDetalle.getCantidad());
        }
    }

    public String factura() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-10s | %-8s | %-10s | %-6s | %-10s%n",
                "Producto", "Cantidad", "Subtotal", "IVA", "Total"));
        sb.append("---------------------------------------------------------\n");
        for (String llave : productos.keySet()) {
            Detalle detalle = productos.get(llave);
            double subtotal = detalle.getPrecio() * detalle.getCantidad();
            double iva = detalle.getHadIva() ? subtotal * detalle.getIva() : 0.0;
            double total = subtotal + iva;

            sb.append(String.format("%-10s | %-8d | %-10.2f | %-6.2f | %-10.2f%n",
                    llave, detalle.getCantidad(), subtotal, iva, total));
        }
        return sb.toString();
    }

}
