import java.util.ArrayList;
import java.util.Scanner;

public class MainCiudad {

    //Marta Jumilla Antón

    private static void modificarCiudad(Ciudad ciudad) {
        Scanner sc = new Scanner(System.in);
        boolean datosValidos = false;

        while (!datosValidos) {
            try {
                System.out.println("Modifica los datos de la ciudad: " + ciudad);
                System.out.print("Nuevo código para la ciudad: ");
                int nuevoCodciudad = sc.nextInt();
                sc.nextLine();

                System.out.print("Nuevo nombre de ciudad: ");
                String nuevoNomciudad = sc.nextLine();

                ciudad.setCodciudad(nuevoCodciudad);
                ciudad.setNomciudad(nuevoNomciudad);

                if (ciudad.validarCodciudad() && ciudad.validarNomciudad()) {
                    datosValidos = true;
                } else {
                    System.out.println("Datos inválidos");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Ciudad> ciudades = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        try {
            while (continuar) {
                System.out.print("Introduce el código de la ciudad (o 0 para terminar): ");
                int codigo = sc.nextInt();
                sc.nextLine();

                if (codigo == 0) {
                    continuar = false;
                }

                System.out.print("Introduce el nombre de la ciudad: ");
                String nombre = sc.nextLine();

                Ciudad ciudad = new Ciudad(codigo, nombre);

                if (ciudad.validarCodciudad() && ciudad.validarNomciudad()) {
                    ciudades.add(ciudad);
                    System.out.println("Ciudad creada: " + ciudad);
                } else {
                    System.out.println("Datos inválidos de: " + ciudad);
                    modificarCiudad(ciudad);
                    ciudades.add(ciudad);
                    System.out.println("Ciudad modificada y añadida correctamente: " + ciudad);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
