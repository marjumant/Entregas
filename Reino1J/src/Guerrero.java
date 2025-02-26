import java.util.ArrayList;

public class Guerrero extends Heroe {
    private int fuerza;

    public Guerrero(String nombre, int nivel, int puntosDeVida, int fuerza, ArrayList<Arma> armas) {
        super(nombre, nivel, puntosDeVida, armas);
        this.fuerza = fuerza;
    }

    @Override
    public void habilidadEspecial() {
        System.out.println(nombre + " ataca con un golpe fuerte usando " + armas);
    }
}
