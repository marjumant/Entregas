package ConsumerSupplier;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Programador {
    private String nombre;
    private double salario;
    private LocalDate fechaInicio;

    public Programador(String nombre, double salario, LocalDate fechaInicio) {
        this.nombre = nombre;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
    }

    public Programador(String nombre) {
        this.nombre = nombre;
        this.salario = 0.0;
        this.fechaInicio = null;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public static void main(String[] args) {
        Supplier<Programador> programadorSupplier = () -> new Programador("Juan Pérez", 50000.0, LocalDate.of(2023, 1, 15));

        Consumer<Programador> mostrarInformacionConsumer = programador -> {
            System.out.println("Nombre: " + programador.getNombre());
            System.out.println("Salario: " + programador.getSalario());
            System.out.println("Fecha de Inicio: " + (programador.getFechaInicio() != null ? programador.getFechaInicio().toString() : "No especificada"));
        };

        Programador programador = programadorSupplier.get();

        mostrarInformacionConsumer.accept(programador);
    }
}

