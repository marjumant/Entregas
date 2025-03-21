import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pintura pintura = new Pintura(250);
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Esfera("Esfera", 25));
        formas.add(new Rectangulo("Rectangulo", 10, 15));
        formas.add(new Cilindro("Cilindro", 12, 25));

        for (Forma forma : formas){
            pintura.pinturaNecesaria(forma);
        }
    }
}