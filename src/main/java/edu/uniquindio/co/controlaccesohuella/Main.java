package edu.uniquindio.co.controlaccesohuella;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> huellas = new HashSet<>();
        huellas.add("1124312515");
        huellas.add("1088264053");
        huellas.add("6465683535");
        huellas.add("3545687676");
        System.out.println(huellas);
        System.out.println(huellas.contains("1124312515"));
        huellas.remove("1124312515");
        System.out.println(huellas);
        huellas.add("1124312516");
        System.out.println(huellas);
        huellas.add("1124312516");
        System.out.println(huellas);
    }
}
