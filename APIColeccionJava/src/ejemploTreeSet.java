import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ejemploTreeSet { //no permite colocar cualquier objeto, deben ser comparables.
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>((a,b) ->  b.compareTo(a));
        //retorna el inverso, descendente


        //son ordenados por lo que les cuesta ordenar y desordenar
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");
        System.out.println(ts); // no mantiene el orden en el que se insertan pero si el orden alfabetico y no repite datos

        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());      //retorna el inverso, descendente
        numeros.add(1);
        numeros.add(5);
        numeros.add(3);
        numeros.add(4);
        numeros.add(10);
        System.out.println("numeros = " + numeros); //se ordenan de forma numerica automaticamente.





    }
}
