import java.util.*;
import java.io.*;

public class Jugadores {

    public static ArrayList<String[]> leer(String ruta) {
        ArrayList<String[]> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            br.readLine();
            br.readLine();
            String cadena;
            while ((cadena = br.readLine()) != null) {
                lista.add(cadena.split(";"));
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return lista;
    }

    public static void escribir(ArrayList<String[]> datos, String ruta) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            bw.write("Lista de jugadores alojados en Hotel Melià\n" +
                    "\n" +
                    "Ranking        Nombre\n" +
                    "---------------------------------------\n");
            for (String[] fila : datos) {
                if (fila.length > 0) {
                    String ultimaCelda = fila[fila.length - 1];
                    if (ultimaCelda.toUpperCase().contains("H")) {
                        bw.write(fila[0] + " -- " + fila[2]);
                        bw.newLine();
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String rutaInicio = "/home/marjumant/Descargas/jugadores.txt";
        String rutaFinal = "/home/marjumant/Descargas/jugadoresAlojados.txt";
        ArrayList<String[]> lista = leer(rutaInicio);
        escribir(lista,rutaFinal);
    }
} 
