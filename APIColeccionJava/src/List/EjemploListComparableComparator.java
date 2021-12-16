package List;

import java.util.*;



public class EjemploListComparableComparator {
    public static void main(String[] args) {

        List<Alumno> sa = new LinkedList<>();
// los repetidos se toman en cuenta y se ordenan segun como lo ingresamos

        sa.add(new Alumno("Pato", 5 ));
        sa.add(new Alumno("Cata", 6 ));
        sa.add(new Alumno("Luis", 9 ));
        sa.add(new Alumno("Jano", 6 ));
        sa.add(new Alumno("Lucio", 3 ));
        sa.add(new Alumno("Zeus", 1 ));
        sa.add(new Alumno("Zeus", 1 ));

       // Collections.sort(sa, (a,b) -> a.getNota().compareTo(b.getNota()));
      //  sa.sort((a,b)-> a.getNota().compareTo(b.getNota()));
        sa.sort(Comparator.comparing(Alumno::getNombre).reversed());
        System.out.println(sa);


        System.out.println("Iterando usando Stream foreach ");
        sa.forEach(System.out::println);


    }

}
