package edu.uniquindio.co.inventariocodigo;

import java.util.HashMap;

public class Inventario {
    private HashMap<String, Producto> productos;

    public Inventario() {
        productos = new HashMap<>();
    }

    public void agregarProducto(String codigo, Producto producto) {
        productos.put(codigo, producto);
        System.out.println("Producto agregado: " + producto);
    }

    public void actualizarStock(String codigo, int nuevoStock) {
        Producto p = productos.get(codigo);
        if (p != null) {
            p.setStock(nuevoStock);
            System.out.println("Stock actualizado: " + p);
        } else {
            System.out.println("Producto con código " + codigo + " no existe.");
        }
    }

    public void consultarPrecio(String codigo) {
        Producto p = productos.get(codigo);
        if (p != null) {
            System.out.println("💲 El precio de " + p.getNombre() + " es $" + p.getPrecio());
        } else {
            System.out.println("Producto con código " + codigo + " no encontrado.");
        }
    }

    public void listarFaltantes() {
        System.out.println("Productos sin stock:");
        for (Producto p : productos.values()) {
            if (p.getStock() == 0) {
                System.out.println("No hay: " + p);
            }
        }
    }

    public void listarTodos() {
        System.out.println("Inventario completo:");
        for (String codigo : productos.keySet()) {
            System.out.println(codigo + " → " + productos.get(codigo));
        }
    }
}

