import java.util.Scanner;

public class Toner {
    private int nivelTinta;

    Scanner sc= new Scanner(System.in);
    int tintaAñadida;

    public Toner(int nivelTinta) {
        if (nivelTinta > 100 || nivelTinta < 0){
            this.nivelTinta = -1;
        }
        else {
            this.nivelTinta = nivelTinta;
        }
    }

    public int getNivelTinta() {
        return nivelTinta;
    }

    public void setNivelTinta(int nivelTinta) {
        this.nivelTinta = nivelTinta;
    }

    public void añadirTinta(){
        if (nivelTinta < 100){
            System.out.println("Cantidad de tinta actual: " + nivelTinta + "Cuanta tinta quieres añadir?");
                tintaAñadida = sc.nextInt();
            nivelTinta = nivelTinta + tintaAñadida;
            while (nivelTinta > 100){
                System.out.println("La cantidad de tinta no puede superar 100");
                nivelTinta = nivelTinta - tintaAñadida;
                System.out.println("Cantidad de tinta actual: " + nivelTinta + "Cuanta tinta quieres añadir?");
                    tintaAñadida = sc.nextInt();
                nivelTinta = nivelTinta + tintaAñadida;
            }
            System.out.println("Nueva cantidad de tinta: " + nivelTinta);
        }
    }
}
