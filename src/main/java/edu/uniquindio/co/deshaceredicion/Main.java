package edu.uniquindio.co.deshaceredicion;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.aplicarOperacion(new Rotar());
        editor.aplicarOperacion(new Recortar());
        editor.aplicarOperacion(new Brillo());
        editor.aplicarOperacion(new Rotar());

        System.out.println("\n--- Haciendo 3 undo ---");
        editor.deshacer();
        editor.deshacer();
        editor.deshacer();
    }
}

