import java.util.ArrayList;
import java.util.Scanner;

public class MainViaje {
    //Marta Jumilla Antón

    private static void modificarViaje(Viaje viaje) {
        Scanner sc = new Scanner(System.in);
        boolean datosValidos = false;

        while (!datosValidos) {
            try {
                System.out.println("Modifica los datos del viaje: " + viaje);
                System.out.print("Nuevo código para el viaje: ");
                int nuevoCodViaje = sc.nextInt();
                sc.nextLine();

                System.out.print("Nuevo lugar de viaje: ");
                String nuevoLugarViaje = sc.nextLine();

                System.out.print("Nuevo código de colegio: ");
                int nuevoCodCole = sc.nextInt();
                sc.nextLine();

                viaje.setCodViaje(nuevoCodViaje);
                viaje.setLugarViaje(nuevoLugarViaje);
                viaje.setCodCole(nuevoCodCole);

                if (viaje.validarCodViaje() && viaje.validarLugarViaje() && viaje.validarCodCole()) {
                    datosValidos = true;
                } else {
                    System.out.println("Datos inválidos.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        }
    }

    public static void main (String[] args) {
        ArrayList<Viaje> viajes = new ArrayList<>();
        try {
            viajes.add(new Viaje(1, "Roma", 101));
            viajes.add(new Viaje(2, "Paris", 104));
            viajes.add(new Viaje(3, "Santiago", 103));
            viajes.add(new Viaje(4, "Matola", 106));
            viajes.add(new Viaje(5, "Tabarca", 105));

            for (Viaje viaje : viajes) {
                if (viaje.validarCodViaje() && viaje.validarLugarViaje() && viaje.validarCodCole()) {
                    System.out.println("Viaje creado: " + viaje);
                } else {
                    System.out.println("Datos inválidos de: " + viaje);
                    modificarViaje(viaje);
                    System.out.println("Viaje modificado: " + viaje);
                }
            }
        } catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
        }
    }
}