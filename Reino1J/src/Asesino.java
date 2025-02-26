import java.util.ArrayList;

public class Asesino extends Heroe {
    private int sigilo;

    public Asesino(String nombre, int nivel, int puntosDeVida, int sigilo, ArrayList<Arma> armas) {
        super(nombre, nivel, puntosDeVida, armas);
        this.sigilo = sigilo;
    }

    @Override
    public void habilidadEspecial() {
        System.out.println(nombre + " asesina en las sombras con " + armas);
    }
}
