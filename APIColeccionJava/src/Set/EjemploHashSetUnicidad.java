package Set;

import java.util.*;


public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
        Set<Alumno>  sa = new HashSet<>();
    //    List<Alumno> sa = new LinkedList<>(); //permite iterar con todos y mantiene el orden enel cual se agregan los datos


        sa.add(new Alumno("Pato", 5 ));
        sa.add(new Alumno("Cata", 6 ));
        sa.add(new Alumno("Luis", 9 ));
        sa.add(new Alumno("Jano", 6 ));
        sa.add(new Alumno("Lucio", 3 ));
        sa.add(new Alumno("Zeus", 1 ));
        sa.add(new Alumno("Zeus", 1 ));

        System.out.println(sa);



        System.out.println("Iterando usando un foreach");
        for (Alumno a : sa ) {
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando usando while y iterator");
        Iterator<Alumno> it = sa.iterator();

        while (it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando usando Stream foreach ");
        sa.forEach(System.out::println);

        /*
        System.out.println("Usando un for clásico");
        for (int i = 0; i <sa.size() ; i++) {

            Alumno a = sa.get(i); //muestra el arreglo ordenado segun posicion en una lista.
            System.out.println(a.getNombre());
        }

         */
    }

}
