package Function;

import java.util.function.BiFunction;

public class Suma {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sumar = (a, b) -> a + b;

        int numero1 = 8;
        int numero2 = 7;

        int resultado = sumar.apply(numero1, numero2);
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + resultado);
    }
}