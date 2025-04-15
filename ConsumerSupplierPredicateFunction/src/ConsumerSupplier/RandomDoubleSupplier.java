package ConsumerSupplier;

import java.util.function.Supplier;
import java.util.Random;

public class RandomDoubleSupplier {
    public static void main(String[] args) {
        Supplier<Double> randomDoubleSupplier = () -> new Random().nextDouble();

        double numeroAleatorio = randomDoubleSupplier.get();

        System.out.println("Número aleatorio generado: " + numeroAleatorio);
    }
}
