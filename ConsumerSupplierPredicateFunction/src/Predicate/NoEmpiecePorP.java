package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NoEmpiecePorP {

    public static Predicate<String> noEmpiezaPorP() {
        return cadena -> !cadena.startsWith("P");
    }

    public static void main(String[] args) {
        List<String> cadenas = Arrays.asList("Abril", "Mayo", "Junio", "Febrero", "Primero", "Segundo");

        Predicate<String> predicadoNoEmpiezaPorP = noEmpiezaPorP();

        List<String> cadenasFiltradas = cadenas.stream()
                .filter(predicadoNoEmpiezaPorP)
                .collect(Collectors.toList());

        System.out.println("Cadenas que no empiezan por 'P': " + cadenasFiltradas);
    }
}

