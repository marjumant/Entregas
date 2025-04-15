package ConsumerSupplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerUltimaLetra {
    public static void main(String[] args) {
        List<String> listaPalabras = Arrays.asList(
                "programación",
                "java",
                "lambda",
                "interfaz",
                "función",
                "consumer",
                "expresión",
                "desarrollo",
                "informática",
                "aplicación"
        );

        Consumer<String> mostrarUltimaLetra = palabra -> {
            if (palabra != null && !palabra.isEmpty()) {
                char ultimaLetra = palabra.charAt(palabra.length() - 1);
                System.out.println("La última letra de '" + palabra + "' es: " + ultimaLetra);
            } else {
                System.out.println("La palabra está vacía o es nula");
            }
        };

        System.out.println("Últimas letras de las palabras en la lista:");

        listaPalabras.forEach(mostrarUltimaLetra);
    }
}
