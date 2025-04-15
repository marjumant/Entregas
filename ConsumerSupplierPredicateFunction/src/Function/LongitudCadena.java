package Function;

import java.util.function.Function;

public class LongitudCadena {

    public static void main(String[] args) {
        Function<String, Integer> obtenerLongitud = cadena -> cadena.length();

        String cadena = "Programación";

        int longitud = obtenerLongitud.apply(cadena);

        System.out.println("La longitud de la cadena \"" + cadena + "\" es: " + longitud);
    }
}

