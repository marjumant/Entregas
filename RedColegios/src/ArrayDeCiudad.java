import java.util.ArrayList;

public class ArrayDeCiudad {

    //MARTA JUMILLA ANTÓN

    private ArrayList<Ciudad> ciudades;

    public ArrayDeCiudad() {
        this.ciudades = new ArrayList<>();
    }

    public boolean addNewCiudad(Ciudad ciudad) {
        if (findCiudad(ciudad.getCodciudad()) == null) {
            ciudades.add(ciudad);
            return true;
        }
        return false;
    }

    public boolean removeCiudad(String nombre) {
        for (int i = 0; i < ciudades.size(); i++) {
            if (ciudades.get(i).getNomciudad().equalsIgnoreCase(nombre)) {
                ciudades.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean updateCiudad(int codigo, Ciudad newCiudad) {
        Ciudad oldCiudad = findCiudad(codigo);
        if (oldCiudad != null) {
            ciudades.set(ciudades.indexOf(oldCiudad), newCiudad);
            return true;
        }
        return false;
    }

    private Ciudad findCiudad(int codigo) {
        for (Ciudad ciudad : ciudades) {
            if (ciudad.getCodciudad() == codigo) {
                return ciudad;
            }
        }
        return null;
    }

    public int findCiudad(String nombre){
        for (int i = 0; i < this.ciudades.size(); i++){
            if(this.ciudades.get(i).getNomciudad().equalsIgnoreCase(nombre)){
                return i;
            }
        }
        return -1;
    }

    public Ciudad queryCiudad(String nombre) {
        for (int i = 0; i < ciudades.size(); i++) {
            if (ciudades.get(i).getNomciudad().equalsIgnoreCase(nombre)) {
                return ciudades.get(i);
            }
        }
        return null;
    }

    public void printCiudades() {
        for (Ciudad ciudad : ciudades) {
            System.out.println(ciudad);
        }
    }
}