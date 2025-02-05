import java.util.ArrayList;
import java.util.Scanner;

public class MainCiudades {
    //Marta Jumilla Antón

    private static void modificarCiudad(Ciudades ciudad) {
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

                if (ciudad.validarCodciudad() == true && ciudad.validarNomciudad() == true) {
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

    public static void main(String[] args) {
        ArrayList<Ciudades> ciudades = new ArrayList<>();
        try {
            ciudades.add(new Ciudades(1, "Madrid"));
            ciudades.add(new Ciudades(2, "Barcelona"));
            ciudades.add(new Ciudades(3, "Valencia"));
            ciudades.add(new Ciudades(4, "Elche"));
            ciudades.add(new Ciudades(5, "Alicante"));

            for (Ciudades ciudad : ciudades) {
                if (ciudad.validarCodciudad() == true && ciudad.validarNomciudad() == true) {
                    System.out.println("Ciudad creada: " + ciudad);
                } else {
                    System.out.println("Datos inválidos de: " + ciudad);
                    modificarCiudad(ciudad);
                    System.out.println("Ciudad modificada: " + ciudad);
                }
            }
        } catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
        }
    }
}