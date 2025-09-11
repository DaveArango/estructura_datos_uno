package edu.uniquindio.co.tarifatramos.model;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Model {
    public static void main(String[] args) {
        TreeMap<Integer, BigDecimal> peajes = new TreeMap<>();
        peajes.put(4000, BigDecimal.valueOf(0.40));
        peajes.put(3000, BigDecimal.valueOf(0.30));
        peajes.put(2000, BigDecimal.valueOf(0.20));
        peajes.put(1000, BigDecimal.valueOf(0.10));
        peajes.put(7000, BigDecimal.valueOf(0.70));
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el peso del vehiculo: ");
        int peso = sc.nextInt();

        Integer floorKey = peajes.floorKey(peso);
        Integer ceilingKey = peajes.ceilingKey(peso);

        Map.Entry<Integer, BigDecimal> entrada;
        if (floorKey == null) {
            entrada = peajes.ceilingEntry(peso);
        } else if (ceilingKey == null) {
            entrada = peajes.floorEntry(peso);
        } else {
            if (peso - floorKey <= ceilingKey - peso) {
                entrada = peajes.floorEntry(peso);
            } else {
                entrada = peajes.ceilingEntry(peso);
            }
        }
        BigDecimal costoPeaje = entrada.getValue().multiply(BigDecimal.valueOf(peso));
        System.out.println("El costo del peaje es: " + costoPeaje);
    }
}
