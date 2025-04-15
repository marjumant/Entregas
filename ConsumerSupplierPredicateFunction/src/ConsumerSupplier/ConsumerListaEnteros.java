package ConsumerSupplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerListaEnteros {
    public static void main(String[] args) {
        List<Integer> listaEnteros = Arrays.asList(5, 12, 8, 25, 31, 17, 42, 9, 63, 27);
        Consumer<Integer> mostrarNumero = numero -> System.out.println("Número: " + numero);

        System.out.println("Mostrando los números de la lista:");

        for (Integer numero : listaEnteros) {
            mostrarNumero.accept(numero);
        }
    }
}
