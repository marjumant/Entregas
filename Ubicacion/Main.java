package Map.Ubicacion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer,Ubicacion> ubicaciones = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        crearMapa();
        boolean acabarPrograma = false;
        Ubicacion ubicacionActual = ubicaciones.get(1);
        while (!acabarPrograma) {
            System.out.println(ubicacionActual.getDescripcion());
            recorrerUbicacion(ubicacionActual);
            System.out.println("Introduce la dirección a la que quieras ir: ");
            String direccion = sc.nextLine();
            int resultadoUbicacion = direccionValida(ubicacionActual, direccion);

            if (resultadoUbicacion == -1) {
                System.out.println("No puedes ir a ese lugar");
            } else {
                if (resultadoUbicacion == 0) {
                    System.out.println(ubicaciones.get(0).getDescripcion());
                    acabarPrograma = true;
                } else {
                    ubicacionActual = ubicaciones.get(resultadoUbicacion);
                }
            }
        }
    }

    public static void recorrerUbicacion(Ubicacion ubicaciones2) {
        System.out.println("Tus salidas posibles son: ");
        for (Map.Entry<String, Integer> ubicacion : ubicaciones2.getExists().entrySet()) {
            System.out.println(ubicacion.getKey() + " | " + ubicaciones.get(ubicacion.getValue()).getLugar());
        }
    }

    public static int direccionValida (Ubicacion ubicaciones, String opcion) {
        for (Map.Entry<String, Integer> ubicacion : ubicaciones.getExists().entrySet()) {
            if (opcion.equalsIgnoreCase(ubicacion.getKey())) {
                return ubicacion.getValue();
            }
        }
        return -1;
    }

    public static void crearMapa() {
        ubicaciones.put(0, new Ubicacion(0, "Estás sentado en la clase de programación", "Clase programación"));
        ubicaciones.put(1,new Ubicacion(1, "Estás en la cima de una montaña", "Montaña"));
        ubicaciones.put(2,new Ubicacion(2, "Estás bañándote en la playa", "Playa"));
        ubicaciones.put(3,new Ubicacion(3, "Estás dentro de un edificio muy alto", "Edificio"));
        ubicaciones.put(4,new Ubicacion(4, "Estás de pie en un puente", "Puente"));
        ubicaciones.put(5,new Ubicacion(5, "Estás en un bosque", "Bosque"));

        ubicaciones.get(1).addExit("N", 5);
        ubicaciones.get(1).addExit("E", 3);
        ubicaciones.get(1).addExit("S", 4);
        ubicaciones.get(1).addExit("O", 2);

        ubicaciones.get(2).addExit("N", 5);

        ubicaciones.get(3).addExit("O", 1);

        ubicaciones.get(4).addExit("M", 1);
        ubicaciones.get(4).addExit("O", 2);

        ubicaciones.get(5).addExit("S", 1);
        ubicaciones.get(5).addExit("O", 2);
    }
}