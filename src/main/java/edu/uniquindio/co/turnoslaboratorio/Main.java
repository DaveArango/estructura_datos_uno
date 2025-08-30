package edu.uniquindio.co.turnoslaboratorio;

import edu.uniquindio.co.turnoslaboratorio.factory.ModelFactory;
import edu.uniquindio.co.turnoslaboratorio.model.Laboratorio;

public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = new ModelFactory();
        Laboratorio laboratorio = modelFactory.getLaboratorio();
        laboratorio.imprimirFila();
        System.out.println("------------------------------");
        laboratorio.ingreso("Ana");
        laboratorio.imprimirFila();
        System.out.println("------------------------------");
        laboratorio.ingresoPreferencial("José");
        laboratorio.imprimirFila();
        System.out.println("------------------------------");
        laboratorio.salida();
        laboratorio.imprimirFila();
        System.out.println("------------------------------");
        laboratorio.ingreso("Dave");
        laboratorio.imprimirFila();
        System.out.println("------------------------------");
        laboratorio.salida();
        laboratorio.imprimirFila();
    }
}
