package Set.BusElche;

import java.util.LinkedHashMap;
import java.util.Map;

public class LineasBus {
    String Id;
    int tiempo;
    LinkedHashMap<Integer, ParadasBus> paradas;
    Map<ParadasBus, Integer> tiempoBus;

    public LineasBus(String id) {
        Id = id;
        paradas = new LinkedHashMap<>();
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public LinkedHashMap<Integer, ParadasBus> getParadas() {
        return paradas;
    }

    public void setLineas(LinkedHashMap<Integer, ParadasBus> lineas) {
        this.paradas = lineas;
    }
}
