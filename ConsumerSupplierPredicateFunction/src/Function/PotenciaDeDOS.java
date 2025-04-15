package Function;

import java.util.function.Function;

public class PotenciaDeDOS {
    public static void main(String[] args) {
        Function<Integer, Integer> potenciaDeDos = numero -> (int) Math.pow(2, numero);

        int numero = 4;

        int resultado = potenciaDeDos.apply(numero);
        System.out.println("2 elevado a " + numero + " es: " + resultado);
    }
}
