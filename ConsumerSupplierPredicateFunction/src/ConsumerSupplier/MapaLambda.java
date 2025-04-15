package ConsumerSupplier;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapaLambda {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new LinkedHashMap<>();

        mapa.put(1, "Java");
        mapa.put(2, "Python");
        mapa.put(3, "JavaScript");
        mapa.put(4, "C++");
        mapa.put(5, "Ruby");

        System.out.println("Contenido del mapa:");

        mapa.forEach((clave, valor) -> {
            System.out.println("Clave: " + clave + ", Valor: " + valor);
        });
    }
}