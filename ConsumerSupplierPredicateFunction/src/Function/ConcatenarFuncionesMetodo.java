package Function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConcatenarFuncionesMetodo {

    public static void main(String[] args) {
        int base = 2;
        int exponente = 4;

        String resultado = obtenerResultadoPotencia(base, exponente);
        System.out.println(resultado);
    }

    public static String obtenerResultadoPotencia(int base, int exponente) {
        BiFunction<Integer, Integer, Double> calcularPotencia = (b, e) -> Math.pow(b, e);
        Function<Double, String> formatearNumero = numero -> "Resultado: " + numero;

        Double potencia = calcularPotencia.apply(base, exponente);
        return formatearNumero.apply(potencia);
    }
}