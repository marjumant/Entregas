package Predicate;

import java.util.function.BiPredicate;

public class StringsIguales {

    public static BiPredicate<String, String> sonIguales() {
        return (str1, str2) -> str1.equals(str2);
    }

    public static void main(String[] args) {
        BiPredicate<String, String> predicado = sonIguales();

        String str1 = "Hola";
        String str2 = "Hola";
        String str3 = "Adiós";
        String str4 = "hola";

        System.out.println("¿Son \"" + str1 + "\" y \"" + str2 + "\" iguales? " + predicado.test(str1, str2));
        System.out.println("¿Son \"" + str1 + "\" y \"" + str3 + "\" iguales? " + predicado.test(str1, str3));
        System.out.println("¿Son \"" + str1 + "\" y \"" + str4 + "\" iguales? " + predicado.test(str1, str4));
        System.out.println("¿Son \"" + str3 + "\" y \"" + str3 + "\" iguales? " + predicado.test(str3, str3));
    }
}

