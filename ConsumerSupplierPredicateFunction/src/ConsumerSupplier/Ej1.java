package ConsumerSupplier;

import java.util.function.Consumer;

public class Ej1 {
    public static void main(String[] args) {
        Consumer<String> imprimirMensaje = mensaje -> System.out.println(mensaje);
        imprimirMensaje.accept("Estoy en clase de programación");
    }
}
