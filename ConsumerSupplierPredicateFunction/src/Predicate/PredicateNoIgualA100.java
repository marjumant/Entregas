package Predicate;

import java.util.function.Predicate;

public class PredicateNoIgualA100 {

    public static Predicate<Integer> noEsIgualA100() {
        return numero -> numero != 100;
    }

    public static void main(String[] args) {
        Predicate<Integer> predicado = noEsIgualA100();

        int numero1 = 150;
        int numero2 = 75;
        int numero3 = 100;
        int numero4 = 50;

        System.out.println("¿Es " + numero1 + " diferente de 100? " + predicado.test(numero1));
        System.out.println("¿Es " + numero2 + " diferente de 100? " + predicado.test(numero2));
        System.out.println("¿Es " + numero3 + " diferente de 100? " + predicado.test(numero3));
        System.out.println("¿Es " + numero4 + " diferente de 100? " + predicado.test(numero4));
    }
}

