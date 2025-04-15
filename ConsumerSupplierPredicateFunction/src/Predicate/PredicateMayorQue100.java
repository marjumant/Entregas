package Predicate;

import java.util.function.Predicate;

public class PredicateMayorQue100 {

    public static Predicate<Integer> esMayorQue100() {
        return numero -> numero > 100;
    }

    public static void main(String[] args) {
        Predicate<Integer> predicado = esMayorQue100();

        int numero1 = 150;
        int numero2 = 50;

        System.out.println("¿Es " + numero1 + " mayor que 100? " + predicado.test(numero1));
        System.out.println("¿Es " + numero2 + " mayor que 100? " + predicado.test(numero2));
    }
}

