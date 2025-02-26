public class Arma {
    private String nombre;
    private int puntosDeGolpe;

    public Arma(String nombre, int puntosDeGolpe) {
        this.nombre = nombre;
        this.puntosDeGolpe = puntosDeGolpe;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeGolpe() {
        return puntosDeGolpe;
    }
}