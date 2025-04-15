package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class IgualA22 {

    public static Predicate<Integer> esIgualA22() {
        return numero -> numero == 22;
    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 22, 25, 27, 30, 35, 40, 45, 50);

        Predicate<Integer> predicadoIgualA22 = esIgualA22();

        boolean algunoIgualA22 = numeros.stream().anyMatch(predicadoIgualA22);
        System.out.println("¿Algún número es igual a 22? " + algunoIgualA22);
    }
}