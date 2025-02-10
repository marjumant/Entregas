import java.util.ArrayList;
import java.util.Comparator;

public class TelefonoMovil {
    private String myNumber;
    private String nombre;
    private ArrayList<Contacto> myContacts = new ArrayList<>();

    public TelefonoMovil(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contacto contacto){
        if(!this.myContacts.contains(contacto)){
            myContacts.add(contacto);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateContact(Contacto antiguo, Contacto nuevo){
        if(this.myContacts.contains(antiguo) && !this.myContacts.contains(nuevo)){
            int index= this.myContacts.indexOf(antiguo);
            this.myContacts.set(index, nuevo);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contacto contacto){
        if(this.myContacts.contains(contacto)){
            this.myContacts.remove(contacto);
            return true;
        } else {
            return false;
        }
    }

    private int findContact(Contacto contacto){
        if(this.myContacts.contains(contacto)){
            return this.myContacts.indexOf(contacto);
        } else {
            return -1;
        }
    }

    public int findContact(String nombre){
        for (int i = 0; i < this.myContacts.size(); i++){
            if(this.myContacts.get(i).getName().equalsIgnoreCase(nombre)){
                return i;
            }
        }
        return -1;
    }

    public Contacto queryContact(String nombre){
        int index = findContact(nombre);
        if(index >= 0){
            return this.myContacts.get(index);
        } else {
            return null;
        }
    }

    public void printContacts(){
        System.out.println("Lista de contactos:");
        for (int i = 0; i < this.myContacts.size();  i++){
            System.out.println(i+1 + ". " + myContacts.get(i).name + " --> " + myContacts.get(i).phoneNumber);
        }
    }

    public ArrayList<Contacto> getContacts() {
        return myContacts;
    }

    static class comparatorContacto implements Comparator<Contacto> {
        @Override
        public int compare(Contacto c1, Contacto c2) {
            return c1.getName().compareTo(c2.getName());
        }
    }
}