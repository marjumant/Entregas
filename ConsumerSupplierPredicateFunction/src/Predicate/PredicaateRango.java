package Predicate;

import java.util.function.Predicate;

public class PredicaateRango {

    public static Predicate<Integer> estaEntre100y300() {
        return numero -> numero > 100 && numero < 300;
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate = estaEntre100y300();

        int numero1 = 150;
        int numero2 = 100;
        int numero3 = 269;
        int numero4 = 99;

        System.out.println("¿Está " + numero1 + " entre 100 y 300? " + predicate.test(numero1));
        System.out.println("¿Está " + numero2 + " entre 100 y 300? " + predicate.test(numero2));
        System.out.println("¿Está " + numero3 + " entre 100 y 300? " + predicate.test(numero3));
        System.out.println("¿Está " + numero4 + " entre 100 y 300? " + predicate.test(numero4));
    }
}