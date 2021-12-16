package Set;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        Set<Alumno>  sa = new TreeSet<>((a, b) -> b.getNombre().compareTo(a.getNombre()));
        // todos los elementos que se agregan tienen que tener una interfaz
        // comparable y tienen que ser ordenados sino da error
        // (el comparable en la clase alumno)
        sa.add(new Alumno("Pato", 5 ));
        sa.add(new Alumno("Cata", 6 ));
        sa.add(new Alumno("Luis", 9 ));
        sa.add(new Alumno("Jano", 6 )); //la nota de jano esta repetida entonces no se incluye si se busca por nota
        sa.add(new Alumno("Lucio", 3 ));
        sa.add(new Alumno("Zeus", 1 ));
        sa.add(new Alumno("Zeus", 4)); //al ser el nombre igual al otro zeus retorna un cero y no aparece
        System.out.println(sa); //si hay valor repetido lo detecta mediante el comareto y no lo agrega

    }


}
