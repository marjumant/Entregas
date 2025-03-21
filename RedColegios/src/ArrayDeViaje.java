import java.util.ArrayList;

public class ArrayDeViaje {

    //MARTA JUMILLA ANTÓN

    private ArrayList<Viaje> viajes = new ArrayList<>();

    public boolean addNewViaje(Viaje viaje) {
        if (findViaje(viaje.getCodViaje()) == null) {
            viajes.add(viaje);
            return true;
        }
        return false;
    }

    public boolean removeViaje(String lugarViaje) {
        for (int i = 0; i < viajes.size(); i++) {
            if (viajes.get(i).getLugarViaje().equalsIgnoreCase(lugarViaje)) {
                viajes.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean updateViaje(int codigo, Viaje newViaje) {
        Viaje oldViaje = findViaje(codigo);
        if (oldViaje != null) {
            viajes.set(viajes.indexOf(oldViaje), newViaje);
            return true;
        }
        return false;
    }

    private Viaje findViaje(int codigo) {
        for (Viaje viaje : viajes) {
            if (viaje.getCodViaje() == codigo) {
                return viaje;
            }
        }
        return null;
    }

    private int findViaje(String nombre){
        for (int i = 0; i < this.viajes.size(); i++){
            if(this.viajes.get(i).getLugarViaje().equalsIgnoreCase(nombre)){
                return i;
            }
        }
        return -1;
    }

    public Viaje queryViaje(String lugarViaje) {
        for (int i = 0; i < viajes.size(); i++) {
            if (viajes.get(i).getLugarViaje().equalsIgnoreCase(lugarViaje)) {
                return viajes.get(i);
            }
        }
        return null;
    }

    public void printViajes() {
        for (Viaje viaje : viajes) {
            System.out.println(viaje);
        }
    }

    public void XML() {
        for (Viaje viaje : viajes) {
            System.out.println("\n<Viaje>" +
                               "\n   <codViaje>" + viaje.getCodViaje() + "</codViaje>" +
                               "\n   <lugarViaje>" + viaje.getLugarViaje() + "</lugarViaje>" +
                               "\n   <codCole>" + viaje.getCodCole() + "</codCole>" +
                               "\n</Viaje>");
        }
    }
}
