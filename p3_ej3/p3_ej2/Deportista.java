package p3_ej2;

public class Deportista {
    private String nombre;
    private String dni;
    private int numeroJugador;

    public Deportista(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getNumeroJugador() {
        return numeroJugador;
    }
    
    public void setNumeroJugador(int nro){
        this.numeroJugador = nro;
    }

    @Override
    public String toString() {
        return "Deportista [nombre=" + nombre + ", dni=" + dni + ", numeroJugador=" + numeroJugador + "]";
    }
}
