package p3_ej2;
import java.util.List;

public class Equipo implements IDeporte{
    private String nombre;
    private List<Deportista> integrantes;

    public Equipo (String nom){
        this.nombre = nom;
    }
    
    @Override
    public boolean conformar(List<Deportista> integrantes, int cant) {
        if (integrantes.size() >= cant) {
            this.integrantes = integrantes;
            return true;
        }
        return false;
    }
    
    @Override
    public void mostrar() {
        System.out.println("Equipo: " + nombre);
        for (Deportista deportista : integrantes) {
            System.out.println(deportista);
        }
    }

    @Override
    public void numeroDeportista() {
        for (int i = 0; i < integrantes.size(); i++) {
            integrantes.get(i).setNumeroJugador(i + 1);
        }
    }


}
