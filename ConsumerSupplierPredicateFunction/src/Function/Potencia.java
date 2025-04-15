package Function;

import java.util.function.BiFunction;

public class Potencia {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double> calcularPotencia = (base, exponente) -> Math.pow(base, exponente);

        int base = 2;
        int exponente = 3;

        double resultado = calcularPotencia.apply(base, exponente);
        System.out.println(base + " elevado a " + exponente + " = " + resultado);
    }
}
