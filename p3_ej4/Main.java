package p3_ej4;
public class Main{
    public static void main (String[] args) {
        
        GestorViajero gestor = new GestorViajero();

        ViajeroFrecuente vf1= new ViajeroFrecuente(1, "12345678A", "Juan", "Perez", 5000);
        ViajeroFrecuente vf2= new ViajeroFrecuente(2, "87654321B", "Maria", "Gomez", 3000);
        ViajeroFrecuente vf3= new ViajeroFrecuente(3, "11223344C", "Carlos", "Lopez", 100);
        ViajeroFrecuente vf4= new ViajeroFrecuente(4, "44332211D", "Ana", "Martinez", 600000);
        ViajeroFrecuente vf5= new ViajeroFrecuente(5, "99887766E", "Luis", "Garcia", 8000);

        gestor.agregarvf(vf1);
        gestor.agregarvf(vf2);
        gestor.agregarvf(vf3);
        gestor.agregarvf(vf4);
        gestor.agregarvf(vf5);
         
        System.out.print("Ordenados por Millas: ");
        gestor.mostrarOrdenadosPorMillas();
        System.out.print("Nombre más de 200 millas: ");
        gestor.mostrarNombresMas200Millas();
        System.out.print("Viajero con mas millas: ");
        System.out.println(gestor.mostrarViajeroMasMillas());

    }


}
    