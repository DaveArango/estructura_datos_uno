package edu.uniquindio.co.depuracioncorreos;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<String> correos = new HashSet<>();
        correos.add("jhonatandavidvivasarango@gmail.com");
        correos.add("12345@outlook.com");
        correos.add("1234625135@yahoo.com");
        correos.add("12347ff@gmail.com");
        System.out.println(correos);
        System.out.println(correos.size());
        Iterator<String> iterator = correos.iterator();
        while(iterator.hasNext()){
            String correo = iterator.next();
            if(correo.split("@")[1].equals("yahoo.com") ||  correo.split("@")[1].equals("outlook.com")){
                iterator.remove();
            }
        }
        System.out.println(correos);
        System.out.println(correos.size());
    }
}
