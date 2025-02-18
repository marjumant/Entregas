package LinkedList.Ejercicios;

public class Cancion{
    protected String titulo;
    protected Double duracion;

    public Cancion(String titulo, Double duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return this.titulo + ": " + this.duracion;
    }
}
