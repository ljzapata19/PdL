package p3_ej2;
import java.util.List;

public class Pareja implements IDeporte{
    private List<Deportista> integrantes;
    
    public Pareja() {}

    @Override
    public boolean conformar(List<Deportista> integrantes) {
        if (integrantes.size() == 2) {
            this.integrantes = integrantes;
            return true;
        }
        return false;
    }

    @Override
    public void mostrar() {
        System.out.println("Pareja:");
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
