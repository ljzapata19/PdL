package p3_ej2;

import java.util.List;


public interface IDeporte {
    int cantidad_minima=2;

    boolean conformar(List<Deportista> integrantes, int cant);

    void mostrar();

    void numeroDeportista();

}
