package ConsumerSupplier;

import java.util.function.BiFunction;

public class MultiplicacionLambda {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> multiplicar = (a, b) -> a * b;

        int numero1 = -9;
        int numero2 = 7;

        int resultado = multiplicar.apply(numero1, numero2);
        System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es: " + resultado);
    }
}
