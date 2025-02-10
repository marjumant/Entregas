import java.util.Collections;
import java.util.Scanner;

public class MainContacto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        int opcion = 0;

        TelefonoMovil telefonoMovil = new TelefonoMovil("658941237");

        imprimirMenu();

        while(continuar) {
            System.out.println("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if(opcion >= 0 && opcion <= 9) {
                switch (opcion) {
                    case 0:
                        continuar = false;
                        break;
                    case 1:
                        if (telefonoMovil.getContacts().isEmpty()) {
                            System.out.println("Aún no has añadido ningún contacto");
                        } else {
                            telefonoMovil.printContacts();
                        }
                        break;
                    case 2:
                        System.out.println("Introduce un nombre: ");
                        String nombre = sc.nextLine();
                        while (telefonoMovil.findContact(nombre) != -1) {
                            System.out.println("Ese contacto ya existe en tus contactos. Introduce un nombre nuevo: ");
                            nombre = sc.nextLine();
                        }
                        System.out.println("Introduce un número de teléfono: ");
                        String numTelefono = sc.nextLine();
                        while (!numTelefono.matches("[0-9]{9}")) {
                            System.out.println("El número de teléfono debe tener 9 dígitos entre el 0 y el 9");
                            System.out.println("Introduce un número de teléfono: ");
                            numTelefono = sc.nextLine();
                        }
                        telefonoMovil.addNewContact(new Contacto(nombre, numTelefono));
                        break;
                    case 3:
                        System.out.println("Introduce el nombre del contacto que quieras modificar: ");
                        nombre = sc.nextLine();
                        Contacto antiguoContacto = telefonoMovil.queryContact(nombre);

                        if(antiguoContacto != null){
                            System.out.println("Introduce un nuevo nombre: ");
                            String nuevoNombre = sc.nextLine();
                            while (nombre.equals(nuevoNombre))   {
                                System.out.println("Ese nombre ya existe en tus contactos. Introduce un nuevo nombre: ");
                                nuevoNombre = sc.nextLine();
                            }
                            System.out.println("Introduce un nuevo número de teléfono: ");
                            String nuevoNumTelefono = sc.nextLine();
                            while (!nuevoNumTelefono.matches("[0-9]{9}")) {
                                System.out.println("El número de teléfono debe tener 9 dígitos entre el 0 y el 9");
                                System.out.println("Introduce un número de teléfono: ");
                                nuevoNumTelefono = sc.nextLine();
                            }
                            Contacto nuevoContacto = new Contacto(nuevoNombre, nuevoNumTelefono);
                            telefonoMovil.updateContact(antiguoContacto, nuevoContacto);
                            System.out.println("El contacto se ha actualizado correctamente");
                        } else {
                            System.out.println("Ese contacto no existe");
                        }
                        break;
                    case 4:
                        System.out.println("Introduce el nombre del contacto que quieras eliminar: ");
                        nombre = sc.nextLine();
                        Contacto eliminarContacto = telefonoMovil.queryContact(nombre);
                        if(telefonoMovil.findContact(nombre) != -1) {
                            telefonoMovil.removeContact(eliminarContacto);
                            System.out.println("El contacto se ha eliminado correctamente");
                        } else {
                            System.out.println("Ese contacto no existe");
                        }
                        break;
                    case 5:
                        System.out.println("¿Deseas buscar por nombre (N) o por número de teléfono (T)?");
                        String opc = sc.nextLine().toUpperCase();
                        if (opc.equals("N")) {
                            System.out.println("Introduce el nombre del contacto que quieras buscar: ");
                            nombre = sc.nextLine();
                            Contacto contacto = telefonoMovil.queryContact(nombre);
                            if (contacto != null) {
                                System.out.println("Contacto encontrado: " + contacto.getName() + " --> " + contacto.getPhoneNumber());
                            } else {
                                System.out.println("No se encontró un contacto con ese nombre");
                            }
                        } else if (opc.equals("T")) {
                            System.out.println("Introduce el número de teléfono: ");
                            String numeroTelefono = sc.nextLine();
                            boolean encontrado = false;
                            for (Contacto c : telefonoMovil.getContacts()) {
                                if (c.getPhoneNumber().equals(numeroTelefono)) {
                                    System.out.println("Contacto encontrado: " + c.getName() + " --> " + c.getPhoneNumber());
                                    encontrado = true;
                                    break;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("No se encontró un contacto con ese número");
                            }
                        } else {
                            System.out.println("Esa opción no existe");
                        }
                        break;
                    case 6:
                        if (telefonoMovil.getContacts().isEmpty()) {
                            System.out.println("No hay contactos para ordenar");
                        } else {
                            Collections.sort(telefonoMovil.getContacts(), new TelefonoMovil.comparatorContacto());
                            System.out.println("Contactos ordenados por nombre");
                            telefonoMovil.printContacts();
                        }
                        break;
                    case 7:
                        int numeroContactos = telefonoMovil.getContacts().size();
                        System.out.println("El número de contactos actual es: " + numeroContactos);
                        break;
                    case 8:
                        imprimirMenu();
                        break;
                    case 9:
                        if (telefonoMovil.getContacts().isEmpty()) {
                            System.out.println("No hay contactos para eliminar");
                        } else {
                            telefonoMovil.getContacts().clear();
                            System.out.println("Todos los contactos se han borrado correctamente");
                        }
                        break;
                }
            } else {
                System.out.println("Esa opción no existe. La opción debe estar entre 0 y 9");
            }
        }
    }

    public static void imprimirMenu(){
        System.out.println("0 - Para salir");
        System.out.println("1 - Para imprimir lista de contactos");
        System.out.println("2 - Para agregar un nuevo contacto");
        System.out.println("3 - Para actualizar un contacto existente");
        System.out.println("4 - Para eliminar un contacto de la lista");
        System.out.println("5 - Para buscar un contacto");
        System.out.println("6 - Para ordenar los contactos por nombre");
        System.out.println("7 - Para mostrar el número de contactos");
        System.out.println("8 - Para volver a mostrar el menú");
        System.out.println("9 - Para borrar todos los contactos");
    }
}