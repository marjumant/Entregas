package ConsumerSupplier;

import java.util.function.BiFunction;

public class OperacionesAritmeticasLambda {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sumar = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> restar = (a, b) -> a - b;
        BiFunction<Integer, Integer, Integer> multiplicar = (a, b) -> a * b;
        BiFunction<Integer, Integer, Double> dividir = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("No se puede dividir por cero");
            }
            return (double) a / b;
        };

        int numero1 = -9;
        int numero2 = 7;

        System.out.println("Operaciones entre " + numero1 + " y " + numero2 + ":");

        int resultadoSuma = sumar.apply(numero1, numero2);
        System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + resultadoSuma);

        int resultadoResta = restar.apply(numero1, numero2);
        System.out.println("Resta: " + numero1 + " - " + numero2 + " = " + resultadoResta);

        int resultadoMultiplicacion = multiplicar.apply(numero1, numero2);
        System.out.println("Multiplicación: " + numero1 + " * " + numero2 + " = " + resultadoMultiplicacion);

        double resultadoDivision = dividir.apply(numero1, numero2);
        System.out.println("División: " + numero1 + " / " + numero2 + " = " + resultadoDivision);
    }
}