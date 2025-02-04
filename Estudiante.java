public class Estudiante implements Comparable<Estudiante> {
    String nombre;
    int edad;
    int altura;

    public Estudiante(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    @Override
    public int compareTo(Estudiante otroEstudiante) {
        if (this.altura != otroEstudiante.altura){
            return Integer.compare(otroEstudiante.altura, this.altura);
        }
        return Integer.compare(otroEstudiante.edad, this.edad);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                '}';
    }
}
