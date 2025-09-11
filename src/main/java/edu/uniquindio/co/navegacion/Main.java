package edu.uniquindio.co.navegacion;

public class Main {
    public static void main(String[] args) {
        Navegador nav = new Navegador();

        nav.visitar("google.com");
        nav.visitar("youtube.com");
        nav.visitar("wikipedia.org");

        nav.irAtras();
        nav.irAtras();
        nav.irAdelante();
        nav.visitar("stackoverflow.com");
    }
}

