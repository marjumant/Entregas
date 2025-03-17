package Set.BusElche;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ParadasBus A001 = new ParadasBus(1, "C/ Centre-Doctor Caro", "Centre-Doctor Caro");
        ParadasBus A002 = new ParadasBus(2, "C/ Vicente Blasco Ibáñez", "Vicente Blasco Ibañez, 22");
        ParadasBus A003 = new ParadasBus(3, "C/ Vicente Blasco Ibáñez", "Vicente Blasco Ibáñez, 80");
        ParadasBus A004 = new ParadasBus(4, "C/ Inem Carrús", "Inem Carrús");
        ParadasBus A005 = new ParadasBus(5, "C/ Pedro Moreno Sastre", "Pedro Moreno Sastre, 62");

        ParadasBus I003 = new ParadasBus(3, "C/ Vicente Blasco Ibáñez", "Vicente Blasco Ibañez, 80");
        ParadasBus I071 = new ParadasBus(71, "C/ Jorge Juan", "Reina Victoria");
        ParadasBus I335 = new ParadasBus(335, "C/ Gabriel Miró", "Gabriel Miró");
        ParadasBus I346 = new ParadasBus(346, "Passeig de Germanles", "Passeig de Germanles");
        ParadasBus I347 = new ParadasBus(347, "C/ Federico G.Lorca", "Asilo");

        ParadasBus J115 = new ParadasBus(115, "Avg. C.Valenciana", "Centre-Avg. C.Valenciana");
        ParadasBus J002 = new ParadasBus(2, "C/ Vicente Blasco Ibáñez", "Vicente Blasco Ibañez, 22");
        ParadasBus J089 = new ParadasBus(89, "Avinguda Llibertat", "Avinguda Llibertat, 11");
        ParadasBus J090 = new ParadasBus(90, "Renfe", "Parc Municipal");
        ParadasBus J117 = new ParadasBus(117, "C/ Virgen de la Cabeza", "Ll. del Pensionista");

        ParadasBus F115 = new ParadasBus(115, "Avg. C.Valenciana", "Centre-Avg. C.Valenciana");
        ParadasBus F002 = new ParadasBus(2, "C/ Vicente Blasco Ibáñez", "Vicento Blasco Ibañez, 22");
        ParadasBus F056 = new ParadasBus(56, "C/ Cristóbal Sanz", "Cristóbal Sanz");
        ParadasBus F089 = new ParadasBus(89, "Avinguda Llibertat", "Avinguda Llibertat, 11");
        ParadasBus F090 = new ParadasBus(90, "Renfe", "Parc Municipal");

        LineasBus lineaA = new LineasBus("A");
        lineaA.getParadas().put(001, A001);
        lineaA.getParadas().put(002, A002);
        lineaA.getParadas().put(003, A003);
        lineaA.getParadas().put(004, A004);
        lineaA.getParadas().put(005, A005);

        LineasBus lineaI = new LineasBus("I");
        lineaI.getParadas().put(1, I003);
        lineaI.getParadas().put(2, I071);
        lineaI.getParadas().put(3, I335);
        lineaI.getParadas().put(4, I346);
        lineaI.getParadas().put(5, I347);

        LineasBus lineaJ = new LineasBus("J");
        lineaJ.getParadas().put(1, J115);
        lineaJ.getParadas().put(2, J002);
        lineaJ.getParadas().put(3, J089);
        lineaJ.getParadas().put(4, J090);
        lineaJ.getParadas().put(5, J117);

        LineasBus lineaF = new LineasBus("F");
        lineaF.getParadas().put(1, F115);
        lineaF.getParadas().put(2, F002);
        lineaF.getParadas().put(3, F056);
        lineaF.getParadas().put(4, F089);
        lineaF.getParadas().put(5, F090);

        Scanner sc = new Scanner(System.in);
        System.out.println("Elige la parada inicial: ");
        String paradaInicial = sc.nextLine();
        for (ParadasBus paradas : lineaA.getParadas().values()){
            if (Objects.equals(paradaInicial, lineaA.getId())) {
                System.out.println(paradas.getNombre());
            }
        }
        System.out.println("Elige la parada final: ");
        String paradaFinal = sc.nextLine();

        System.out.println("Todas las paradas de la línea A: ");
        for (ParadasBus paradas : lineaA.getParadas().values()){
            System.out.println(paradas.getNombre());
        }
    }
}
