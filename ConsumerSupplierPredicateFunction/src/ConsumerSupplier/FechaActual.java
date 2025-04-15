package ConsumerSupplier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FechaActual {

    public static Supplier<String> obtenerFechaActualSupplier() {
        return () -> {
            LocalDateTime ahora = LocalDateTime.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            return ahora.format(formato);
        };
    }

    public static Consumer<String> mostrarFechaConsumer() {
        return fecha -> System.out.println("La fecha y hora actual es: " + fecha);
    }

    public static void main(String[] args) {
        Supplier<String> fechaSupplier = obtenerFechaActualSupplier();
        Consumer<String> fechaConsumer = mostrarFechaConsumer();

        fechaConsumer.accept(fechaSupplier.get());
    }
}

