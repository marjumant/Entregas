package Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class FiltrarPorInicio {

    public static void main(String[] args) {
        List<String> textos = Arrays.asList("Hola", "Programación", "Java", "Function");

        String condicionInicio = "P";

        for (String texto : textos) {
            String resultado = empiezaPorCondicion.apply(texto, condicionInicio);
            System.out.println("Resultado: " + resultado);
        }
    }

    public static BiFunction<String, String, String> empiezaPorCondicion = (texto, condicion) -> {
        if (texto.startsWith(condicion)) {
            return texto;
        } else {
            return null;
        }
    };
}