import java.util.ArrayList;

public class Arquero extends Heroe {
    private int precision;

    public Arquero(String nombre, int nivel, int puntosDeVida, int precision, ArrayList<Arma> armas) {
        super(nombre, nivel, puntosDeVida, armas);
        this.precision = precision;
    }

    @Override
    public void habilidadEspecial() {
        System.out.println(nombre + " dispara con " + armas);
    }
}
