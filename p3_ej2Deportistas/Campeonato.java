package p3_ej2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    public static final String SEPARADOR = ",";
	
    public List<Deportista>leerArchivo(String nombreArchivo)throws IOException{
        BufferedReader bufferLectura = null;
        List<Deportista> datos = new ArrayList<>();
        try {
            bufferLectura = new BufferedReader(new FileReader(nombreArchivo));
            String linea;                  

            while ((linea=bufferLectura.readLine()) != null) {
             // Sepapar la linea leída con el separador definido previamente
             String[] campos = linea.split(SEPARADOR); 
             Deportista d = new Deportista(campos[0],campos[1]);
             datos.add(d);           
            }
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
         // Cierro el buffer de lectura
         if (bufferLectura != null) {
             bufferLectura.close();
         }
        }
        return datos;
    }
    /**
    * Crea los equipos con los datos pasados como parámetro
    * @param datos lista con todos los deportistas inscriptos
     * @param cantidadJugadores cantidad de jugadores que conforman un equipo
     * @return una lista de equipos
    */
    public List<IDeporte> creaEquipos(List<Deportista> datos, int cantidadJugadores){
        List<IDeporte> equipos = new ArrayList<>();
        int contequipo = 1;
        for (int i = 0; i < datos.size(); i += cantidadJugadores){
            int end = Math.min(i + cantidadJugadores, datos.size());
            List<Deportista> integrantes = datos.subList(i, end);
            Equipo equipo = new Equipo("Equipo "+ contequipo++);
            if (equipo.conformar(integrantes)) {
                equipos.add(equipo);
            }
        }
        return equipos;
    }
    /**
    Crea los equipos con los datos pasados como parámetro
     * @param datos es una lista con todos los deportitas inscriptos
     * @return una lista de Parejas formadas
    */
    public List<IDeporte> creaParejas(List<Deportista> datos){
        List<IDeporte> parejas = new ArrayList<>();
        for (int i = 0; i < datos.size(); i += 2) {
            int end = Math.min(i + 2, datos.size());
            List<Deportista> integrantes = datos.subList(i, end);
            if (integrantes.size() == 2) {
                Pareja pareja = new Pareja();
                if (pareja.conformar(integrantes)) {
                    parejas.add(pareja);
                }
            }
        }
        return parejas;
    }
    /**
    * Numera cada integrante del equipo o de la pareja
     * @param datos 
    */
    public void numerar(List<IDeporte> datos){
        for (IDeporte deporte : datos) {
            deporte.numeroDeportista();
        }
    }
    /**
    * Muestra los datos de cada equipo o de cada pareja
     * @param datos
    */
    public void mostrar(List<IDeporte> datos){
        for (IDeporte deporte : datos) {
            deporte.mostrar();
        }
    }
    
//Parte del codigo para el metodo main() que debera estar definido en la clase principal.    
    /**
     * @-param args the command line arguments
     
    public static void main(String[] args) throws IOException {
        int cantidadJugadoresFutbol= 5;                  
    
        List<Deportista> datosFutbol= leerArchivo("./src/datos/inscriptosFutbol.csv");
        List<Deportista> datosPinPon= leerArchivo(".src/datos/inscriptosPinPon.csv");
    }  */      
}
