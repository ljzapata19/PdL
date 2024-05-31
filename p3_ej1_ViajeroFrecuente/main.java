package p3_ej1;
import java.util.Scanner;
import p3_ej1.ViajeroFrecuente;
import p3_ej1.Gestor;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Gestor gestor = new Gestor();
        ViajeroFrecuente viajero1 = new ViajeroFrecuente(1, "12345678A", "Juan", "Perez", 5000);
        ViajeroFrecuente viajero2 = new ViajeroFrecuente(2, "87654321B", "Maria", "Gomez", 3000);
        ViajeroFrecuente viajero3 = new ViajeroFrecuente(3, "11223344C", "Carlos", "Lopez", 7000);
        ViajeroFrecuente viajero4 = new ViajeroFrecuente(4, "44332211D", "Ana", "Martinez", 6000);
        ViajeroFrecuente viajero5 = new ViajeroFrecuente(5, "99887766E", "Luis", "Garcia", 8000);
        gestor.cargarViajero(viajero1);
        gestor.cargarViajero(viajero2);
        gestor.cargarViajero(viajero3);
        gestor.cargarViajero(viajero4);
        gestor.cargarViajero(viajero5);
        Integer opcion; 
        do {
            System.out.println("Menú:");
            System.out.println("1. Cargar viajero");
            System.out.println("2. Mostrar viajero");
            System.out.println("3. Consultar cantidad de millas");
            System.out.println("4. Acumular millas");
            System.out.println("5. Canjear millas");
            System.out.println("6. Mejor viajero");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = in.nextInt();
            in.nextLine();  // Consume newline

            switch (opcion) {
                case 1:
                    System.out.println("Ha elegido la opción: Cargar viajero...");
                    System.out.print("Ingrese número: ");
                    int numero = in.nextInt();
                    in.nextLine();  // Consume newline
                    System.out.print("Ingrese DNI: ");
                    String dni = in.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre = in.nextLine();
                    System.out.print("Ingrese apellido: ");
                    String apellido = in.nextLine();
                    System.out.print("Ingrese millas: ");
                    int millas = in.nextInt();
                    ViajeroFrecuente nuevoViajero = new ViajeroFrecuente(numero, dni, nombre, apellido, millas);
                    gestor.cargarViajero(nuevoViajero);
                    break;
                case 2:
                    System.out.println("Ha elegido la opción: Mostrar viajero...");
                    ViajeroFrecuente viaj = gestor.buscarViajeroNro();
                    if (viaj != null) {
                        System.out.println(viaj.toString());
                    } else {
                        System.out.println("Viajero no encontrado");
                    }
                    break;
                case 3:
                    System.out.println("Ha elegido la opción: Consultar cantidad de millas...");
                    viaj = gestor.buscarViajeroDNI();
                    if (viaj != null) {
                        System.out.println("El viajero cuyo DNI es: ");
                        System.out.println(viaj.getDni());
                        System.out.println("Tiene acumuladas "+ viaj.getMillas()+" millas.");
                    }else {
                        System.out.print(viaj);
                        System.out.println("Viajero no encontrado");
                    }
                    break;
                case 4: 
                    System.out.println("Ha elegido la opción: Acumular millas...");
                    viaj = gestor.buscarViajeroDNI();
                    if (viaj!=null) {
                        System.out.print("Ingrese millas a acumular: ");
                        int millasacum = in.nextInt();
                        System.out.println("Millas acumuladas: " + viaj.acumularMillas(millasacum));
                    }else {
                        System.out.println("Viajero no encontrado");
                    }
                    break;
                case 5: 
                    System.out.println("Ha elegido la opción: Canjear millas...");
                    viaj = gestor.buscarViajeroDNI();
                    if (viaj!=null) {
                        System.out.print("Ingrese millas a canjear: ");
                        int millascanj = in.nextInt();
                        System.out.println("Millas canjeadas: " + viaj.canjearMillas(millascanj));
                    }else {
                        System.out.println("Viajero no encontrado");
                    }
                    break;
                case 6:
                    System.out.println("Ha elegido la opción: Mejor viajero...");
                    viaj = gestor.mejorViajero();
                    if (viaj!=null) {
                        System.out.println("El mejor viajero es: " + viaj);
                    }else {
                        System.out.println("Viajero no encontrado");
                    }
                    break;
                case 7: 
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 7);
    }
}
