package edu.uniquindio.co.navegacion;

import java.util.ArrayDeque;

public class Navegador {
    private String actual;
    private ArrayDeque<String> atras;
    private ArrayDeque<String> adelante;

    public Navegador() {
        atras = new ArrayDeque<>();
        adelante = new ArrayDeque<>();
    }

    public void visitar(String url) {
        if (actual != null) {
            atras.push(actual);
        }
        actual = url;
        adelante.clear();
        mostrarEstado();
    }

    public void irAtras() {
        if (!atras.isEmpty()) {
            adelante.push(actual);
            actual = atras.pop();
        } else {
            System.out.println("No hay páginas atrás.");
        }
        mostrarEstado();
    }

    public void irAdelante() {
        if (!adelante.isEmpty()) {
            atras.push(actual);
            actual = adelante.pop();
        } else {
            System.out.println("No hay páginas adelante.");
        }
        mostrarEstado();
    }

    private void mostrarEstado() {
        System.out.println("🌐 Página actual: " + actual);
        System.out.println("⬅️ Atrás: " + atras);
        System.out.println("➡️ Adelante: " + adelante);
        System.out.println();
    }
}

