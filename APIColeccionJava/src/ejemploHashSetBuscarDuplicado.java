import java.util.HashSet;
import java.util.Set;

public class ejemploHashSetBuscarDuplicado {
    public static void main(String[] args) {
        String [] peces = {"lenguado", "corvina", "pejerrey", "Atun", "Robalo", "lenguado"};

        Set<String> unicos = new HashSet<>();
        for (String pez: peces ) {
            if(!unicos.add(pez)){
                System.out.println("elemento duplicado: " + pez);

            }

        }
        System.out.println(unicos.size() + "elementos no duplicados " + unicos);
    }
}
