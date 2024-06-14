package p3_ej5;
import java.util.ArrayList;
public class ConjuntoPalabras {
    private ArrayList <Palabra> palabras;

    public ConjuntoPalabras(){
        this.palabras= new ArrayList<>();
    }

    public void agregarPalabra(Palabra p){
        boolean existe = palabras.stream()
        .anyMatch(obj->obj.getPalabra().equals(p.getPalabra()))

        if (existe){
            palabras.stream()
            .filter(obj->obj.getPalabra().equals(p.getPalabra()))
            .findFirst()
            .ifPresent(Palabra::incremento);
        }else{
            palabras.add(p);
        }
    }

    public Palabra buscar (String pbus){
        return palabras.stream()
        .filter(obj->obj.getPalabra().equals(pbus))
        .findFirst()
        .orElse(null);

    }
    public void mostrar(){
        palabras.stream()
        .forEach(System.out::println);
    }

}
