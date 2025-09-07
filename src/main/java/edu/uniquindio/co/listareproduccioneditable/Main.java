package edu.uniquindio.co.listareproduccioneditable;

import edu.uniquindio.co.listareproduccioneditable.model.Cancion;
import edu.uniquindio.co.listareproduccioneditable.model.Reproductor;

public class Main {
    public static void main(String[] args) {
        Reproductor reproductor = new Reproductor();
        Cancion cancion = new Cancion("los pollito pio", "pio pio pio");
        Cancion cancion2 = new Cancion("mayonesa", "ella lo baila como haciendo mayonesa");
        Cancion cancion3 = new Cancion("mi buen amor", "SI NO QUIERES REGRESAR!!!!!!!");
        Cancion cancion4 = new Cancion("Tasa", "tetera, cuchara, cucharon...");
        reproductor.addCancion(cancion);
        reproductor.addCancion(cancion2);
        reproductor.addCancion(cancion3);
        reproductor.addCancion(cancion4);

        reproductor.listarCanciones();
        reproductor.adelantarCancion();
        reproductor.adelantarCancion();
        reproductor.retrocederCancion();
        reproductor.moverCancion(1, 3);
        reproductor.listarCanciones();
    }
}
