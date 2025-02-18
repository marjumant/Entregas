package LinkedList.Ejercicios;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    protected String nombre;
    protected String artista;

    ArrayList<Cancion> canciones;

    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
        this.canciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    private Cancion findSong(String titulo) {
        for (Cancion cancion : canciones) {
            if (cancion.getTitulo().equals(titulo)) {
                return cancion;
            }
        }
        return null;
    }

    public boolean addSong (String titulo,double duracion){
        if (findSong(titulo) == null) {
            canciones.add(new Cancion(titulo, duracion));
            return true;
        } else {
            return false;
        }
    }

    public boolean addToPlayList(int numPista, LinkedList<Cancion> listaReproduccion) {
        for (int i = 0; i < canciones.size(); i++) {
            if(i == numPista -1) {
                listaReproduccion.add(findSong(canciones.get(i).getTitulo()));
                return true;
            }
        }
        return false;
    }

    public boolean addToPlayList(String titulo, LinkedList<Cancion> listaReproduccion) {
        Cancion resultadoBusqueda = findSong(titulo);
        if(resultadoBusqueda != null){
            listaReproduccion.add(resultadoBusqueda);
            return true;
        } else {
            return false;
        }
    }
}
