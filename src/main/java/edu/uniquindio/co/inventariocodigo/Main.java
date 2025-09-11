package edu.uniquindio.co.inventariocodigo;

public class Main {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        inv.agregarProducto("A1", new Producto("Martillo", 25000, 10));
        inv.agregarProducto("B2", new Producto("Destornillador", 8000, 0));
        inv.agregarProducto("C3", new Producto("Taladro", 120000, 5));

        inv.listarTodos();

        System.out.println("\nConsultar precio por código:");
        inv.consultarPrecio("C3");

        System.out.println("\nActualizar stock:");
        inv.actualizarStock("B2", 15);

        System.out.println("\nListar faltantes:");
        inv.listarFaltantes();
    }
}

