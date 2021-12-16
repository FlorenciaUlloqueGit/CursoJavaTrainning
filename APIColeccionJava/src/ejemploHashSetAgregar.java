import java.util.*;

public class ejemploHashSetAgregar {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("uno"); // AGREGA DE FORMA DESORDENADA
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println(hs);

        List<String> lista = new ArrayList<>(hs); // como no se puede ordenar un hashSet lo pasamos a una list y ahi si lo podemos ordenar
        Collections.sort(lista);

        System.out.println(lista);

       boolean b =  hs.add("tres");
        System.out.println("permite elementos duplicados?  "  + b);
        System.out.println(hs); //no agrega de nuevo valores ya agregados anteriormente

    }
}
