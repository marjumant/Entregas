import java.util.Scanner;

public class Impresora {
    private Toner toner;
    private int numeroPaginas;
    private boolean dobleCara;

    Scanner sc2 = new Scanner(System.in);

    public Impresora(int numeroPaginas, boolean dobleCara) {
        this.numeroPaginas = numeroPaginas;
        this.dobleCara = dobleCara;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public boolean isDobleCara() {
        return dobleCara;
    }

    public void setDobleCara(boolean dobleCara) {
        this.dobleCara = dobleCara;
    }

    public void impresionPaginas(){
        System.out.println("¿Qué número de páginas quieres imprimir?");
            numeroPaginas = sc2.nextInt();
        if(dobleCara == true){
            System.out.println("Se han impreso " + (numeroPaginas / 2));
            this.numeroPaginas = numeroPaginas / 2;
        } else {
            System.out.println("Se han impreso " + numeroPaginas);
        }
    }
}
