package edu.uniquindio.co.favoritoscurso;

import java.util.LinkedHashSet;

public class Plataforma {
    private LinkedHashSet<Curso> favoritos;

    public Plataforma() {
        favoritos = new LinkedHashSet<>();
    }

    public void marcarFavorito(Curso curso) {
        favoritos.add(curso);
        mostrarFavoritos();
    }

    public void eliminarFavorito(Curso curso) {
        favoritos.remove(curso);
        mostrarFavoritos();
    }

    public void mostrarFavoritos() {
        System.out.println("Favoritos: " + favoritos);
    }
}

