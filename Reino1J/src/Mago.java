import java.util.ArrayList;

public class Mago extends Heroe {
    private int mana;

    public Mago(String nombre, int nivel, int puntosDeVida, int mana, ArrayList<Arma> armas) {
        super(nombre, nivel, puntosDeVida, armas);
        this.mana = mana;
    }

    @Override
    public void habilidadEspecial() {
        System.out.println(nombre + " lanza un hechizo");
    }
}