public class Pintura {
    protected double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public void pinturaNecesaria(Forma forma) {
        System.out.println(forma.nombre + " necesita " + forma.area() / cobertura + "pintura");
    }
}
