package p3_ej1;
import p3_ej1.ViajeroFrecuente;
import java.util.ArrayList;
import java.util.Scanner;
public class Gestor {
    private Integer cantidad ;
    private ArrayList<ViajeroFrecuente> viajeros;
    
    public Gestor() {
        viajeros = new ArrayList<>();
        this.cantidad = 0;
    }
    
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void cargarViajero(ViajeroFrecuente viajero){
        this.viajeros.add(viajero);
    }
    
    public ViajeroFrecuente buscarViajeroNro(){
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese número del viajero: ");
        int num = in.nextInt();
        ViajeroFrecuente viaj=null;
        for (ViajeroFrecuente viajero: viajeros){
            if (viajero.getNumero() == num) {
                viaj = viajero;
            }
        }
        return viaj;
    }
    
    public ViajeroFrecuente buscarViajeroDNI (){
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese dni del viajero: ");
        String dni = in.nextLine();
        ViajeroFrecuente viaj=null;
        for (ViajeroFrecuente viajero: viajeros){
            if (viajero.getDni().equals(dni)) {
                viaj = viajero;
            }
        }
        return viaj;
    }

    public ViajeroFrecuente mejorViajero() {
        Integer max=0;
        ViajeroFrecuente mejorviaj = null;
        for(ViajeroFrecuente viajero : viajeros){
            if (viajero.getMillas()>max) {
                max = viajero.getMillas();
                mejorviaj=viajero;
            }
        }
        return mejorviaj;
    }

}
