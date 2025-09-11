package edu.uniquindio.co.deshaceredicion;

public class Recortar extends Operacion {
    public Recortar() {
        super("Recortar");
    }
    @Override
    public void aplicar() {
        System.out.println("<Aplicando recorte>");
    }
}
