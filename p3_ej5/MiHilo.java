package p3_ej5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Set;

public class MiHilo extends Thread{
    private String rutaArchivo;
    private ConjuntoPalabras conjuntoPalabras;

    public MiHilo(String ruta){
        this.rutaArchivo=ruta;

    }

    private String limpiarSignos(String texto){
        return texto.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();
    }

    private String [] limpiarStopWords (String[] texto){
        Set<String> stopWords = Set.of("como", "la", "si", "no", "es", "y", "el", "de");
        return Arrays.stream(texto)
                .filter(palabra -> !stopWords.contains(palabra))
                .toArray(String[]::new);
    }

     @Override
    public void run() {
        try {
            String contenido = Files.readString(Paths.get(rutaArchivo));
            String textoLimpio = limpiarSignos(contenido);
            String[] palabras = limpiarStopWords(textoLimpio.split("\\s+"));

            Arrays.stream(palabras)
                .filter(palabra -> !palabra.isEmpty())
                .forEach(palabra -> conjuntoPalabras.agregarPalabra(new Palabra(palabra)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
