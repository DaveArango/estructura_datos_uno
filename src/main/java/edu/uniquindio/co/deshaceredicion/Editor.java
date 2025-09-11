package edu.uniquindio.co.deshaceredicion;

import java.util.Stack;

public class Editor {
    private Stack<Operacion> historial;

    public Editor() {
        historial = new Stack<>();
    }

    // Aplicar una operación y guardarla en el historial
    public void aplicarOperacion(Operacion op) {
        op.aplicar();
        historial.push(op);
        mostrarEstado();
    }

    // Deshacer la última operación
    public void deshacer() {
        if (!historial.isEmpty()) {
            Operacion ultima = historial.pop();
            System.out.println("Deshaciendo: " + ultima.getNombre());
        } else {
            System.out.println("No hay operaciones para deshacer");
        }
        mostrarEstado();
    }

    // Mostrar el estado actual del historial
    public void mostrarEstado() {

        System.out.print("Historial: ");
        if (historial.isEmpty()) {
            System.out.println("No hay operaciones aun");
        } else {
            for (Operacion op : historial) {
                System.out.print(op.getNombre() + " | ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------");
    }
}

