package Function;

import java.util.function.Function;

public class ConcatenarFunctions {
    public static void main(String[] args) {
        Function<String, Integer> calcularLongitud = texto -> texto.length();

        Function<Integer, Integer> potenciaDeDos = numero -> (int) Math.pow(2, numero);

        Function<String, Integer> longitudYPotencia = calcularLongitud.andThen(potenciaDeDos);

        String palabra = "Programación";
        int resultado = longitudYPotencia.apply(palabra);

        System.out.println(resultado);
    }
}
