package Set.BusElche;

import Set.CuerpoCeleste.CuerpoCeleste;

import java.util.HashSet;
import java.util.Set;

public class ParadasBus {
    private int numero;
    private String nombre;
    private String direccion;
    private Set<ParadasBus> paradas;

    public ParadasBus(int numero, String direccion, String nombre) {
        this.numero = numero;
        this.direccion = direccion;
        this.nombre = nombre;
        this.paradas = new HashSet<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<ParadasBus> getParadas() {
        return paradas;
    }

    public void setParadas(Set<ParadasBus> paradas) {
        this.paradas = paradas;
    }

    @Override
    public String toString() {
        return "ParadasBus{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion +
                '}';
    }
}
