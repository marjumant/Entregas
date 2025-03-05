package Map.Ubicacion;

import java.util.HashMap;
import java.util.Map;

public class Ubicacion {
    protected int id;
    protected  String descripcion;
    Map<String,Integer> exists;
    String lugar;

    public Ubicacion(int id, String descripcion, String lugar) {
        this.id = id;
        this.descripcion = descripcion;
        this.lugar = lugar;
        this.exists = new HashMap<>();
        this.exists.put("Q", 0);
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Map<String, Integer> getExists() {
        return exists;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void addExit(String direccion, int idUbicacion) {
        this.exists.put(direccion, idUbicacion);
    }
}
