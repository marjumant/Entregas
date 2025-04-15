package ConsumerSupplier;

import java.util.function.Supplier;

public class SuplierEjemplo {
    public static void main(String[] args) {
        Supplier<String> mensajeSupplier = () -> "Java es un lenguaje de programación";

        String mensaje = mensajeSupplier.get();

        System.out.println(mensaje);
    }
}
