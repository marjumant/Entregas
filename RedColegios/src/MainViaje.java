import java.util.Scanner;
import java.util.Scanner;

public class MainViaje {

    //MARTA JUMILLA ANTÓN

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
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        ArrayDeViaje arrayDeViaje = new ArrayDeViaje();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n******** Menú ********");
            System.out.println("""
                    0. Salir
                    1. Insertar Viaje
                    2. Eliminar Viaje
                    3. Actualizar Viaje
                    4. Consultar Viaje
                    5. Imprimir Viajes
                    6. Imprimir XML""");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n-------- Insertar Viaje --------");
                    System.out.print("Introduce el código del viaje: ");
                    int codViaje = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Introduce el lugar del viaje: ");
                    String lugarViaje = sc.nextLine();
                    System.out.print("Introduce el código del colegio que realiza el viaje: ");
                    int codCole = sc.nextInt();
                    sc.nextLine();

                    Viaje nuevoViaje = new Viaje(codViaje, lugarViaje, codCole);
                    if (nuevoViaje.validarCodViaje() && nuevoViaje.validarLugarViaje() && nuevoViaje.validarCodCole()) {
                        if (arrayDeViaje.addNewViaje(nuevoViaje)) {
                            System.out.println("Viaje añadido: " + nuevoViaje);
                        } else {
                            System.out.println("Ya existe un viaje con ese código");
                        }
                    } else {
                        System.out.println("Datos inválidos de: " + nuevoViaje);
                        modificarViaje(nuevoViaje);
                        if (arrayDeViaje.addNewViaje(nuevoViaje)) {
                            System.out.println("Viaje modificado y añadido correctamente: " + nuevoViaje);
                        } else {
                            System.out.println("Ya existe un viaje con ese código");
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n-------- Eliminar Viaje --------");
                    System.out.print("Introduce el lugar del viaje a eliminar: ");
                    lugarViaje = sc.nextLine();
                    if (arrayDeViaje.removeViaje(lugarViaje)) {
                        System.out.println("Viaje eliminado");
                    } else {
                        System.out.println("Viaje no encontrado");
                    }
                    break;

                case 3:
                    System.out.println("\n-------- Actualizar Viaje --------");
                    System.out.print("Introduce el lugar del viaje a actualizar: ");
                    lugarViaje = sc.nextLine();
                    Viaje viajeExistente = arrayDeViaje.queryViaje(lugarViaje);
                    if (viajeExistente != null) {
                        modificarViaje(viajeExistente);
                        if (arrayDeViaje.updateViaje(viajeExistente.getCodViaje(), viajeExistente)) {
                            System.out.println("Viaje actualizado: " + viajeExistente);
                        } else {
                            System.out.println("Error al actualizar el viaje");
                        }
                    } else {
                        System.out.println("Viaje no encontrado");
                    }
                    break;

                case 4:
                    System.out.println("\n-------- Consultar Viaje --------");
                    System.out.print("Introduce el lugar del viaje a consultar: ");
                    lugarViaje = sc.nextLine();
                    Viaje viajeConsultado = arrayDeViaje.queryViaje(lugarViaje);
                    if (viajeConsultado != null) {
                        System.out.println("Viaje encontrado: " + viajeConsultado);
                    } else {
                        System.out.println("Viaje no encontrado");
                    }
                    break;

                case 5:
                    System.out.println("\n-------- Imprimir Viajes --------");
                    arrayDeViaje.printViajes();
                    break;

                case 6:
                    System.out.println("\n-------- Imprimir XML --------");
                    arrayDeViaje.XML();
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
