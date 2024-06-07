package p3_ej2;

import java.io.IOException;
import java.util.List;

 
public class Main {
    public static void main(String[] args) throws IOException {
        Campeonato campeonato = new Campeonato();
        int cantidadJugadoresFutbol= 5;                  
        
        //lee
        List<Deportista> datosFutbol= campeonato.leerArchivo("p3_ej3\\p3_ej2\\inscriptosFutbol.csv");
        List<Deportista> datosPinPon= campeonato.leerArchivo("p3_ej3\\p3_ej2\\inscriptosPinPon.csv");
        
        //crea eq futbol
        List<IDeporte> equiposFutsal = campeonato.creaEquipos(datosFutbol, cantidadJugadoresFutbol);
        campeonato.numerar(equiposFutsal);
        System.out.println("Equipos de Futsal:");
        campeonato.mostrar(equiposFutsal);

        //crea eq de pin pon
        List<IDeporte> parejasPinPon = campeonato.creaParejas(datosPinPon);
        campeonato.numerar(parejasPinPon);
        System.out.println("Parejas de Pin Pon:");
        campeonato.mostrar(parejasPinPon);

    }        
}
