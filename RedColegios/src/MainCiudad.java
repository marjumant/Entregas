import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCiudad {

    //MARTA JUMILLA ANTÓN

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
        ArrayDeCiudad arrayDeCiudad = new ArrayDeCiudad();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n******** Menú ********");
            System.out.println("""
                    0. Salir
                    1. Insertar Ciudad
                    2. Eliminar Ciudad
                    3. Actualizar Ciudad
                    4. Consultar Ciudad
                    5. Imprimir Ciudades""");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:

                    System.out.println("\n-------- Insertar Ciudad --------");
                    System.out.print("Introduce el código de la ciudad: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Introduce el nombre de la ciudad: ");
                    String nombre = sc.nextLine();

                    Ciudad nuevaCiudad = new Ciudad(codigo, nombre);
                    if (nuevaCiudad.validarCodciudad() && nuevaCiudad.validarNomciudad()) {
                        if (arrayDeCiudad.addNewCiudad(nuevaCiudad)) {
                            System.out.println("Ciudad añadida: " + nuevaCiudad);
                        } else {
                            System.out.println("Ya existe una ciudad con ese código");
                        }
                    } else {
                        System.out.println("Datos inválidos de: " + nuevaCiudad);
                        modificarCiudad(nuevaCiudad);
                        if (arrayDeCiudad.addNewCiudad(nuevaCiudad)) {
                            System.out.println("Ciudad modificada y añadida correctamente: " + nuevaCiudad);
                        } else {
                            System.out.println("Ya existe una ciudad con ese código");
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n-------- Eliminar Ciudad --------");
                    System.out.print("Introduce el nombre de la ciudad a eliminar: ");
                    nombre = sc.nextLine();
                    if (arrayDeCiudad.removeCiudad(nombre)) {
                        System.out.println("Ciudad eliminada");
                    } else {
                        System.out.println("Ciudad no encontrada");
                    }
                    break;

                case 3:
                    System.out.println("\n-------- Actualizar Ciudad --------");
                    System.out.print("Introduce el nombre de la ciudad a actualizar: ");
                    nombre = sc.nextLine();
                    Ciudad ciudadExistente = arrayDeCiudad.queryCiudad(nombre);
                    if (ciudadExistente != null) {
                        modificarCiudad(ciudadExistente);
                        if (arrayDeCiudad.updateCiudad(ciudadExistente.getCodciudad(), ciudadExistente)) {
                            System.out.println("Ciudad actualizada: " + ciudadExistente);
                        } else {
                            System.out.println("Error al actualizar la ciudad");
                        }
                    } else {
                        System.out.println("Ciudad no encontrada");
                    }
                    break;

                case 4:
                    System.out.println("\n-------- Consultar Ciudad --------");
                    System.out.print("Introduce el nombre de la ciudad a consultar: ");
                    nombre = sc.nextLine();
                    Ciudad ciudadConsultada = arrayDeCiudad.queryCiudad(nombre);
                    if (ciudadConsultada != null) {
                        System.out.println("Ciudad encontrada: " + ciudadConsultada);
                    } else {
                        System.out.println("Ciudad no encontrada");
                    }
                    break;

                case 5:
                    System.out.println("\n-------- Imprimir Ciudades --------");
                    arrayDeCiudad.printCiudades();
                    break;

                case 0:
                    System.out.println("\n******** Saliendo del programa ********");
                    break;

                default:
                    System.out.println("\n******** Opción no válida ********");
            }
        } while (opcion != 0);
    }
}