package Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class FiltrarTextosPorLongitud {

    public static void main(String[] args) {
        List<String> textos = Arrays.asList("Hola", "Programación", "Java", "Function");

        int longitudMinima = 4;

        for (String texto : textos) {
            String resultado = filtrarPorLongitud.apply(texto, longitudMinima);
            System.out.println("Resultado: " + resultado);
        }
    }

    public static BiFunction<String, Integer, String> filtrarPorLongitud = (texto, condicion) -> {
        if (texto.length() > condicion) {
            return texto;
        } else {
            return null;
        }
    };
}