package Function;

import java.util.function.Function;

public class FormatearResultado {
    public static void main(String[] args) {
        Function<Double, String> formatearNumero = numero -> "Resultado: " + numero;

        System.out.println(formatearNumero.apply(42.57));
    }
}