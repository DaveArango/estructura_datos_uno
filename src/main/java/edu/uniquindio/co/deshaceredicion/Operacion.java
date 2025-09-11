package edu.uniquindio.co.deshaceredicion;

abstract class Operacion {
    private String nombre;

    public Operacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    public abstract void aplicar();
}

