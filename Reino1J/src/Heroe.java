import java.util.ArrayList;

public class Heroe {
    protected String nombre;
    protected int nivel;
    protected int puntosDeVida;
    protected ArrayList<Arma> armas;

    public Heroe(String nombre, int nivel, int puntosDeVida, ArrayList<Arma> armas) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
        this.armas = armas;
    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa una habilidad especial");
    }

    @Override
    public String toString() {
        String armasString = "";
        for (Arma arma : armas) {
            armasString += arma.getNombre() + ", ";
        }
        return "Heroe{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", puntosDeVida=" + puntosDeVida +
                ", armas=" + armasString +
                '}';
    }
}