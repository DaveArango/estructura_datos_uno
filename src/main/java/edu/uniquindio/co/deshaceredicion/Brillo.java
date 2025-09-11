package edu.uniquindio.co.deshaceredicion;

public class Brillo extends Operacion {
    public Brillo() {
        super("Ajustar brillo");
    }
    @Override
    public void aplicar() {
        System.out.println("_Ajustando brillo_");
    }
}
