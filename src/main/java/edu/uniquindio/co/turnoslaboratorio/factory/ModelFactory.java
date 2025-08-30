package edu.uniquindio.co.turnoslaboratorio.factory;

import edu.uniquindio.co.turnoslaboratorio.model.Laboratorio;
import edu.uniquindio.co.turnoslaboratorio.utils.DataUtil;
import lombok.Getter;

public class ModelFactory {
    private static ModelFactory instance;
    @Getter
    private Laboratorio laboratorio;

    public ModelFactory(){
        laboratorio = DataUtil.inicializarDatos();
    }

    public static ModelFactory getInstance(){
        if(instance==null){
            instance=new ModelFactory();
        }
        return instance;
    }
}
