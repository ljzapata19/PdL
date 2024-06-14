package p3_ej4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class GestorViajero {
    private List<ViajeroFrecuente> viajeros;

    public GestorViajero() {
        this.viajeros = new ArrayList<>();
    }
    
    public void agregarvf(ViajeroFrecuente vf){
        this.viajeros.add(vf);
    }

    public void mostrarvf(){
        viajeros.stream()
        .map(obj->obj.getNombre())
        .forEach(System.out::println);
    }

    public void mostrarOrdenadosPorMillas (){
        viajeros.stream()
        .sorted(Comparator.comparing(ViajeroFrecuente::getMillas))
        .forEach(System.out::println);
    }

    public void mostrarNombresMas200Millas (){
        viajeros.stream()
        .filter(x->x.getMillas()>200)
        .map(ViajeroFrecuente::getNombre)
        .forEach(System.out::println);
    }

    
    public ViajeroFrecuente mostrarViajeroMasMillas () {
        return viajeros.stream()
        .max(Comparator.comparing(ViajeroFrecuente::getMillas))
        .orElse(null);
    }


    
}
