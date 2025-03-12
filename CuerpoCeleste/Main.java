package Set.CuerpoCeleste;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    static Map<String, CuerpoCeleste> sistemaSolar = new HashMap<>();
    static Set<CuerpoCeleste> planetas = new HashSet<>();

    public static void main(String[] args) {
        CuerpoCeleste Mercurio = new Planeta("Mercurio", 88);
        planetas.add(Mercurio);
        sistemaSolar.put("Mercurio", Mercurio);

        CuerpoCeleste Venus = new Planeta("Venus", 225);
        planetas.add(Venus);
        sistemaSolar.put("Venus", Venus);

        CuerpoCeleste LaTierra = new Planeta("La Tierra", 365);
        planetas.add(LaTierra);
        sistemaSolar.put("La Tierra", LaTierra);


        CuerpoCeleste Marte = new Planeta("Marte", 687);
        planetas.add(Marte);
        sistemaSolar.put("Marte", Marte);


        CuerpoCeleste Jupiter = new Planeta("Jupiter", 4332);
        planetas.add(Jupiter);
        sistemaSolar.put("Jupiter", Jupiter);


        CuerpoCeleste Saturno = new Planeta("Saturno", 10759);
        planetas.add(Saturno);
        sistemaSolar.put("Saturno", Saturno);


        CuerpoCeleste Urano = new Planeta("Urano", 30660);
        planetas.add(Urano);
        sistemaSolar.put("Urano", Urano);


        CuerpoCeleste Neptuno = new Planeta("Neptuno", 165);
        planetas.add(Neptuno);
        sistemaSolar.put("Neptuno", Neptuno);


        CuerpoCeleste Pluton = new PlanetaEnano("Plutón", 248);
        planetas.add(Pluton);
        sistemaSolar.put("Plutón",Pluton );


        CuerpoCeleste Luna = new Luna("Luna", 27);
        Luna.addSatelite(Luna);
        sistemaSolar.put("Luna", Luna);
        LaTierra.addSatelite(Luna);

        CuerpoCeleste Deimos = new Luna("Deimos", 1.3);
        Luna.addSatelite(Deimos);
        sistemaSolar.put("Deimos", Deimos);
        Marte.addSatelite(Deimos);

        CuerpoCeleste Phobos = new Luna("Phobos", 0.3);
        Luna.addSatelite(Phobos);
        sistemaSolar.put("Luna", Luna);
        Marte.addSatelite(Phobos);

        CuerpoCeleste Europa = new Luna("Europa", 3.5);
        Luna.addSatelite(Europa);
        sistemaSolar.put("Europa", Europa);
        Jupiter.addSatelite(Europa);

        CuerpoCeleste Io = new Luna("Io", 1.8);
        Luna.addSatelite(Io);
        sistemaSolar.put("Io", Io);
        Jupiter.addSatelite(Io);

        CuerpoCeleste Ganymede = new Luna("Ganymede", 7.1);
        Luna.addSatelite(Ganymede);
        sistemaSolar.put("Ganymede", Ganymede);
        Jupiter.addSatelite(Ganymede);

        CuerpoCeleste Callisto = new Luna("Callisto", 16.7);
        Luna.addSatelite(Callisto);
        sistemaSolar.put("Callisto", Callisto);
        Jupiter.addSatelite(Callisto);

        for (CuerpoCeleste planeta : planetas) {
            System.out.println(planeta.getNombre());
        }

        CuerpoCeleste LunasMarte = sistemaSolar.get("Marte");
        System.out.println("Lunas de Marte: ");
        for (CuerpoCeleste lunas : LunasMarte.getSatelites()) {
            System.out.println(lunas);
        }

        Set<CuerpoCeleste> lunas = new HashSet<>();
        for (CuerpoCeleste planeta : planetas) {
            lunas.addAll(planeta.getSatelites());
        }

        System.out.println("Todas las lunas: ");
        for (CuerpoCeleste luna : lunas) {
            System.out.println(luna);
        }

        CuerpoCeleste Pluton2 = new Planeta("Plutón", 884);
        if (planetas.add(Pluton2)) {
            System.out.println("Se ha añadido el nuevo planeta");
        } else {
            System.out.println("No se ha podido añadir. Ese planeta ya existe");
        }

        CuerpoCeleste PlutonEnano2 = new PlanetaEnano("Plutón", 884);
        if (planetas.add(PlutonEnano2)) {
            System.out.println("Se ha añadido el nuevo planeta");
        } else {
            System.out.println("No se ha podido añadir. Ese planeta ya existe");
        }

        Set<CuerpoCeleste> planetas2 = new HashSet<>();
        planetas2.add(new Planeta("Mercurio", 88));
        planetas2.add(new Planeta("Venus", 225));
        planetas2.add(new Planeta("La Tierra", 687));
        planetas2.add(new Planeta("Ceres", 1680));

        // Intersección
        Set<CuerpoCeleste> interseccion = new HashSet<>(planetas);
        interseccion.retainAll(planetas2);
        System.out.println("La intersección entre planetas es: ");
        for (CuerpoCeleste planeta : interseccion) {
            System.out.println(planeta.getNombre());
        }

        // Diferencia (planetas - planetas2)
        Set<CuerpoCeleste> diferencia = new HashSet<>(planetas);
        diferencia.removeAll(planetas2);
        System.out.println("La diferencia entre los planetas es: ");
        for (CuerpoCeleste planeta : diferencia) {
            System.out.println(planeta.getNombre());
        }
    }
}
