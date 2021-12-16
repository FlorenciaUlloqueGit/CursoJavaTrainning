package List;



import java.util.ArrayList;
import java.util.List;


public class EjemploArrayList {
    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();
// los repetidos se toman en cuenta y se ordenan segun como lo ingresamos

        System.out.println(al  + " tamaño ="+ al.size());
        System.out.println("Está vacía = " + al.isEmpty());
        al.add(new Alumno("Pato", 5 ));
        al.add(new Alumno("Cata", 6 ));
        al.add(new Alumno("Luis", 9 ));
        al.add(2, new Alumno("Jano", 6 )); //muevo a jano a 2 y luis se desplaza dodne estaba jano
        al.add(new Alumno("Lucio", 3 ));
        al.set(3, new Alumno("Zeus", 1 )); //al ser set se modifica y no agrega, por lo que se borra a luis

        System.out.println(al  + " tamaño ="+ al.size());

        //eliminar:
        al.remove(new Alumno("Jano", 6));
        al.remove(2); //elimina segun el índice
        System.out.println(al  + " tamaño ="+ al.size()); //deben ser iguales todos los datos sino no se elimina

        boolean b = al.contains(new Alumno("Jano", 6));
        System.out.println("La lista contiene a jano = " + b); //debe ser falso

        Object a[] = al.toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println("desde el arreglo " + a[i]);

        }

    }

}
