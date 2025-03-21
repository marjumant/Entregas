public class Cilindro extends Forma{
    protected double radio;
    protected double altura;

    public Cilindro(String nombre, double radio, double altura) {
        super(nombre);
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio,2) * altura;
    }

    @Override
    public String toString() {
        return "Cilindro:" + "radio=" + radio + ", altura=" + altura + ", nombre='" + nombre;
    }
}
