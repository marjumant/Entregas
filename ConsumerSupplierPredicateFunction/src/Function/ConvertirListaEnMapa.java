package Function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class ConvertirListaEnMapa {

    public static Map<String, Integer> convertirListaEnMap(List<String> lista, Function<String, Integer> funcion) {
        Map<String, Integer> mapa = new HashMap<>();

        for (String elemento : lista) {
            mapa.put(elemento, funcion.apply(elemento));
        }

        return mapa;
    }

    public static void main(String[] args) {
        List<String> textos = Arrays.asList("Java", "Programación", "Lambda", "Función");

        Function<String, Integer> calcularLongitud = texto -> texto.length();

        Map<String, Integer> resultado = convertirListaEnMap(textos, calcularLongitud);

        System.out.println("Mapa resultante:");
        resultado.forEach((texto, longitud) -> {
            System.out.println("Texto: '" + texto + "', Longitud: " + longitud);
        });
    }
}