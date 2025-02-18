package LinkedList.Ejercicios;

import java.util.*;

public class MainCancion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListIterator<Cancion> iteratorCancion;

        boolean continuar = true;
        int opcion = 0;
        boolean haciaAdelante = true;
        String nombreAlbum;

        ArrayList<Album> albums = new ArrayList<>();

        Album album1 = new Album("Sakura", "Saiko");
        album1.addSong("3 CAÍDAS", 4.11);
        album1.addSong("LUNA", 4.00);
        album1.addSong("BOREAL", 2.45);
        album1.addSong("HEY BB", 2.43);
        album1.addSong("YO LO SOÑÉ", 2.55);
        album1.addSong("LUNA", 3.10);
        albums.add(album1);

        Album album2 = new Album("Resolution", "Lamb Of God");
        album2.addSong("Desolation", 3.55);
        album2.addSong("Ghost Walking", 4.31);
        album2.addSong("Guilty", 3.25);
        album2.addSong("The Undertow", 4.47);
        album2.addSong("The Number Six", 5.22);
        albums.add(album2);

        LinkedList<Cancion> playList = new LinkedList<>();

        album1.addToPlayList("3 CAÍDAS", playList);
        album2.addToPlayList("Ghost Walking", playList);
        album2.addToPlayList("Guilty", playList);
        album1.addToPlayList("HEY BB", playList);
        album1.addToPlayList("BOREAL", playList);
        album2.addToPlayList("The Number Six", playList);
        album1.addToPlayList("LUNA", playList);
        album2.addToPlayList("Desolation", playList);
        album1.addToPlayList("YO LO SOÑÉ", playList);
        album2.addToPlayList("The Undertow", playList);
        album1.addToPlayList(6, playList);

        iteratorCancion = playList.listIterator();

        imprimirMenu();

        try {
            while (continuar) {
                System.out.println("Elige una opción: ");
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 0:
                        continuar = false;
                        break;
                    case 1:
                        if (!haciaAdelante) {
                            if(iteratorCancion.hasNext()) {
                                iteratorCancion.next();
                            }
                            haciaAdelante = true;
                        }
                        if (iteratorCancion.hasNext()){
                            System.out.println("Reproduciendo: " + iteratorCancion.next());
                        } else {
                            System.out.println("No quedan más canciones");
                        }
                        break;
                    case 2:
                        if (haciaAdelante) {
                            if (iteratorCancion.hasPrevious()) {
                                iteratorCancion.previous();
                            }
                            haciaAdelante = false;
                        }
                        if (iteratorCancion.hasPrevious()) {
                            System.out.println("Reproduciendo: " + iteratorCancion.previous());
                        } else {
                            System.out.println("No quedan canciones previas");
                        }
                        break;
                    case 3:
                        if (haciaAdelante) {
                            iteratorCancion.previous();
                            System.out.println("Volviendo a reproducir: " + iteratorCancion.next());
                        }
                        if (!haciaAdelante) {
                            iteratorCancion.next();
                            System.out.println("Volviendo a reprofucir: " + iteratorCancion.previous());
                        }
                        break;
                    case 4:
                        for (Cancion cancion : playList) {
                            System.out.println(cancion);
                        }
                        break;
                    case 5:
                        try {
                            if (!playList.isEmpty()) {
                                iteratorCancion.remove();
                                System.out.println("La canción actual ha sido eliminada");
                            } else {
                                System.out.println("No hay nada para eliminar. La playlist está vacía");
                            }
                            if (iteratorCancion.hasNext()) {
                                System.out.println("Reproduciendo: " + iteratorCancion.next());
                            } else {
                                System.out.println("Reproduciendo: " + iteratorCancion.previous());
                            }
                        } catch (NoSuchElementException e) {
                            System.out.println("Prueba");
                        } catch (IllegalStateException _) {
                            System.out.println("Prueba2");
                        }
                        break;
                    case 6:
                        System.out.println("Escribe el nombre del álbum que quieras mostrar");
                        nombreAlbum = sc.nextLine();
                        for (Album album : albums) {
                            if (album.getNombre().equalsIgnoreCase(nombreAlbum)) {
                                System.out.println("Álbum: " + album.getNombre() + " Artista: " + album.getArtista());
                                ArrayList<Cancion> canciones = album.getCanciones();
                                for (Cancion cancion : canciones) {
                                    System.out.println(cancion.toString());
                                }
                            } else {
                                System.out.println("Ese álbum no existe");
                            }
                        }
                        break;
                    case 7:
                        imprimirMenu();
                        break;
                }
            }
        } catch (InputMismatchException e){
            System.out.println("Error. Introduce un número del 0 al 7");
        }
    }
        public static void imprimirMenu(){
            System.out.println("0 - Para salir de la lista de reproducción");
            System.out.println("1 - Para reproducir la siguiente canción de la lista");
            System.out.println("2 - Para reproducir la canción previa de la lista");
            System.out.println("3 - Para repetir la canción actual");
            System.out.println("4 - Para imprimir la lista de canciones en la playlist");
            System.out.println("5 - Eliminar canción actual de la playlist");
            System.out.println("6 - Para imprimir las canciones por álbum");
            System.out.println("7 - Para volver a imprimir el menú");
        }
}