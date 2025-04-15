package Function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConcatenarFunciones2{
    public static void main(String[] args) {
        // Función del ejercicio 6
        BiFunction<Integer, Integer, Double> calcularPotencia = (base, exponente) -> Math.pow(base, exponente);

        // Función del ejercicio 7
        Function<Double, String> formatearNumero = numero -> "Resultado: " + numero;

        int base = 2;
        int exponente = 4;

        Double potencia = calcularPotencia.apply(base, exponente);

        String resultadoFinal = formatearNumero.apply(potencia);

        System.out.println(resultadoFinal);
    }
}