public class Esfera extends Forma{
    protected double radio;

    public Esfera(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(radio,2);
    }

    @Override
    public String toString() {
        return "Esfera:" + "radio=" + radio + ", nombre='" + nombre;
    }
}