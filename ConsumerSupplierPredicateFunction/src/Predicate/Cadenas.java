package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Cadenas {

    public static Predicate<String> empiezaPorA() {
        return cadena -> cadena.startsWith("A");
    }

    public static Predicate<String> tieneLongitud5() {
        return cadena -> cadena.length() == 5;
    }

    public static void main(String[] args) {
        List<String> cadenas = Arrays.asList("Abril", "Mayo", "Junio", "Agosto", "Enero", "Febrero");

        Predicate<String> predicadoEmpiezaPorA = empiezaPorA();
        Predicate<String> predicadoTieneLongitud5 = tieneLongitud5();

        Predicate<String> predicadoCombinado = predicadoEmpiezaPorA.and(predicadoTieneLongitud5);

        List<String> cadenasFiltradas = cadenas.stream()
                .filter(predicadoCombinado)
                .collect(Collectors.toList());

        System.out.println("Cadenas que empiezan por 'A' y tienen longitud 5: " + cadenasFiltradas);
    }
}