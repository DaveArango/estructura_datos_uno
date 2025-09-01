package edu.uniquindio.co.conteoconcurrentesimple;

import edu.uniquindio.co.conteoconcurrentesimple.model.Registro;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Registro registro =  new Registro();
        registro.registrar("Andrea");
        registro.registrar("Juan");
        registro.registrar("Maria");
        registro.registrar("Juan");
        registro.registrar("Juan");
        registro.topTres();
    }
}
