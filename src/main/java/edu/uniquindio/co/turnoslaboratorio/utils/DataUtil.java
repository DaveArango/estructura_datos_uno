package edu.uniquindio.co.turnoslaboratorio.utils;

import edu.uniquindio.co.turnoslaboratorio.model.Laboratorio;

public class DataUtil {
    public static Laboratorio inicializarDatos(){
        Laboratorio laboratorio = new Laboratorio();
        laboratorio.ingreso("Andres");
        laboratorio.ingreso("Juan");
        laboratorio.ingreso("Francisco");
        return laboratorio;
    }
}
