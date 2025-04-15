package ConsumerSupplier;

import java.util.function.BiFunction;

public class CalculadoraLambda {

    /**
     * Método que acepta dos enteros y una expresión lambda para realizar una operación
     * @param a primer número entero
     * @param b segundo número entero
     * @param operacion expresión lambda que define la operación a realizar
     * @param <R> tipo de retorno de la operación
     * @return resultado de aplicar la operación a los dos números
     */
    public static <R> R calculator(int a, int b, BiFunction<Integer, Integer, R> operacion) {
        return operacion.apply(a, b);
    }

    public static void main(String[] args) {
        int numero1 = -9;
        int numero2 = 7;

        BiFunction<Integer, Integer, Integer> sumar = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> restar = (a, b) -> a - b;
        BiFunction<Integer, Integer, Integer> multiplicar = (a, b) -> a * b;
        BiFunction<Integer, Integer, Double> dividir = (a, b) -> b != 0 ? (double) a / b : Double.NaN;

        System.out.println("Operaciones entre " + numero1 + " y " + numero2 + ":");

        int resultadoSuma = calculator(numero1, numero2, sumar);
        System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + resultadoSuma);

        int resultadoResta = calculator(numero1, numero2, restar);
        System.out.println("Resta: " + numero1 + " - " + numero2 + " = " + resultadoResta);

        int resultadoMultiplicacion = calculator(numero1, numero2, multiplicar);
        System.out.println("Multiplicación: " + numero1 + " * " + numero2 + " = " + resultadoMultiplicacion);

        double resultadoDivision = calculator(numero1, numero2, dividir);
        System.out.println("División: " + numero1 + " / " + numero2 + " = " + resultadoDivision);
    }
}
