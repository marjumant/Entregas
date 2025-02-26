import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Heroe> heroes = new ArrayList<>();
    private static ArrayList<Arma> armas = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Arma armaPredeterminada = new Arma("Espada rota", 5);
        armas.add(armaPredeterminada);
        menu();
    }

    private static void menu() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("""
                    =======================
                         MENÚ REINO 1J     
                    =======================""");
            System.out.println("""
                    1. Añadir Héroe
                    2. Añadir Arma
                    3. Eliminar Héroe
                    4. Buscar Héroe
                    5. Listar Héroes
                    6. Salir
                    -----------------------""");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    añadirHeroe();
                    break;
                case 2:
                    añadirArma();
                    break;
                case 3:
                    eliminarHeroe();
                    break;
                case 4:
                    buscarHeroe();
                    break;
                case 5:
                    listarHeroes();
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private static void añadirHeroe() {
        System.out.println("¿Qué tipo de héroe quieres añadir?");
        System.out.println("""
                1: Guerrero/a
                2: Mago/a
                3: Arquero/a
                4: Asesino/a""");

        int tipo = sc.nextInt();
        sc.nextLine();

        System.out.print("Nombre del héroe: ");
        String nombre = sc.nextLine();
        System.out.print("Nivel: ");
        int nivel = sc.nextInt();
        System.out.print("Puntos de Vida: ");
        int puntosDeVida = sc.nextInt();

        Heroe heroe = null;
        switch (tipo) {
            case 1:
                System.out.print("Fuerza: ");
                int fuerza = sc.nextInt();
                heroe = new Guerrero(nombre, nivel, puntosDeVida, fuerza, elegirArmas());
                break;
            case 2:
                System.out.print("Mana: ");
                int mana = sc.nextInt();
                heroe = new Mago(nombre, nivel, puntosDeVida, mana, elegirArmas());
                break;
            case 3:
                System.out.print("Precisión: ");
                int precision = sc.nextInt();
                heroe = new Arquero(nombre, nivel, puntosDeVida, precision, elegirArmas());
                break;
            case 4:
                System.out.print("Sigilo: ");
                int sigilo = sc.nextInt();
                heroe = new Asesino(nombre, nivel, puntosDeVida, sigilo, elegirArmas());
                break;
            default:
                System.out.println("Tipo de héroe no válido");
                return;
        }

        heroes.add(heroe);
        System.out.println(nombre + " ha sido añadido al gremio");
    }

    private static void añadirArma() {
        System.out.print("Nombre del arma: ");
        String nombre = sc.nextLine();
        System.out.print("Puntos de Golpe: ");
        int puntosDeGolpe = sc.nextInt();
        armas.add(new Arma(nombre, puntosDeGolpe));
        System.out.println(nombre + " se ha añadido al arsenal");
    }

    private static ArrayList<Arma> elegirArmas() {
        ArrayList<Arma> armasElegidas = new ArrayList<>();
        boolean continuar = true;
        while (continuar) {
            System.out.println("Elige un arma (0 para terminar):");
            for (int i = 0; i < armas.size(); i++) {
                System.out.println((i + 1) + ": " + armas.get(i).getNombre() + " (Puntos de Golpe: " + armas.get(i).getPuntosDeGolpe() + ")");
            }
            int opcion = sc.nextInt();
            if (opcion == 0) {
                continuar = false;
            } else if (opcion > 0 && opcion <= armas.size()) {
                Arma armaSeleccionada = armas.get(opcion - 1);
                if (armasElegidas.contains(armaSeleccionada)) {
                    System.out.println("Esta arma ya ha sido seleccionada. Elige otra");
                } else {
                    armasElegidas.add(armaSeleccionada);
                }
            } else {
                System.out.println("Opción no válida");
            }
        }
        return armasElegidas;
    }

    private static void eliminarHeroe() {
        System.out.print("Introduce el nombre del héroe que quiras eliminar: ");
        String nombre = sc.nextLine();

        boolean encontrado = false;
        for (Heroe heroe : heroes) {
            if (heroe.nombre.equalsIgnoreCase(nombre)) {
                heroes.remove(heroe);
                encontrado = true;
                System.out.println(nombre + " se ha eliminado del gremio");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado ningún héroe con ese nombre");
        }
    }

    private static void buscarHeroe() {
        System.out.print("Introduce el nombre del héroe que quieras buscar: ");
        String nombre = sc.nextLine();
        boolean encontrado = false;
        for (Heroe heroe : heroes) {
            if (heroe.nombre.equalsIgnoreCase(nombre)) {
                System.out.println(heroe);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado ningún héroe con ese nombre");
        }
    }

    private static void listarHeroes() {
        for (Heroe heroe : heroes) {
            System.out.println(heroe);
        }
    }
}