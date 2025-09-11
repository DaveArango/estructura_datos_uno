package edu.uniquindio.co.favoritoscurso;

public class Main {
    public static void main(String[] args) {
        Plataforma p = new Plataforma();

        Curso java = new Curso("Java");
        Curso python = new Curso("Python");
        Curso elixir = new Curso("Elixir");
        Curso sql = new Curso("SQL");

        p.marcarFavorito(java);
        p.marcarFavorito(python);
        p.marcarFavorito(elixir);
        p.marcarFavorito(sql);

        System.out.println("\nIntento agregar duplicado:");
        p.marcarFavorito(python);

        System.out.println("\nEliminamos y volvemos a insertar:");
        p.eliminarFavorito(java);
        p.marcarFavorito(java);
    }
}

