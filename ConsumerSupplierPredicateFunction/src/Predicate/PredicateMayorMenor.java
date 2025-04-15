package Predicate;

import java.util.function.Predicate;

public class PredicateMayorMenor {

    public static Predicate<Integer> esMayorQue100OMenorQue50() {
        return numero -> numero > 100 || numero < 50;
    }

    public static void main(String[] args) {
        Predicate<Integer> predicado = esMayorQue100OMenorQue50();

        int numero1 = 150;
        int numero2 = 75;
        int numero3 = 25;
        int numero4 = 100;

        System.out.println("¿Es " + numero1 + " mayor que 100 o menor que 50? " + predicado.test(numero1));
        System.out.println("¿Es " + numero2 + " mayor que 100 o menor que 50? " + predicado.test(numero2));
        System.out.println("¿Es " + numero3 + " mayor que 100 o menor que 50? " + predicado.test(numero3));
        System.out.println("¿Es " + numero4 + " mayor que 100 o menor que 50? " + predicado.test(numero4));
    }
}

