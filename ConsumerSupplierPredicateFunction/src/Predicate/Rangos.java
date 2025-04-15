package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Rangos {

    public static Predicate<Integer> esMayorQue25() {
        return numero -> numero > 25;
    }

    public static Predicate<Integer> esMenorQue30() {
        return numero -> numero < 30;
    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 25, 27, 30, 35, 40, 45, 50, 55);

        Predicate<Integer> predicadoMayorQue25 = esMayorQue25();
        Predicate<Integer> predicadoMenorQue30 = esMenorQue30();

        Predicate<Integer> predicadoCombinado = predicadoMayorQue25.and(predicadoMenorQue30);

        List<Integer> numerosFiltrados = numeros.stream()
                .filter(predicadoCombinado)
                .collect(Collectors.toList());

        System.out.println("Números que son mayores que 25 y menores que 30: " + numerosFiltrados);
    }
}