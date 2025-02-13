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
                    System.out.println("Datos inválidos");
                    datosValidos = false;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Viaje> viajes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        try {
            while (continuar) {
                System.out.print("Introduce el código del viaje (o -1 para terminar): ");
                int codViaje = sc.nextInt();
                sc.nextLine();

                if (codViaje == -1) {
                    continuar = false;
                }

                System.out.print("Introduce el lugar del viaje: ");
                String lugarViaje = sc.nextLine();

                System.out.print("Introduce el código del colegio que realiza el viaje: ");
                int codCole = sc.nextInt();
                sc.nextLine();

                Viaje viaje = new Viaje(codViaje, lugarViaje, codCole);

                if (viaje.validarCodViaje() && viaje.validarLugarViaje() && viaje.validarCodCole()) {
                    viajes.add(viaje);
                    System.out.println("Viaje creado: " + viaje);
                } else {
                    System.out.println("Datos inválidos de: " + viaje);
                    modificarViaje(viaje);
                    viajes.add(viaje);
                    System.out.println("Viaje modificado: " + viaje);
                }
            }

            System.out.println("Lista de viajes:");
            for (Viaje viaje : viajes) {
                System.out.println(viaje);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
