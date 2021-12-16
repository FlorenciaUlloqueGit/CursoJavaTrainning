package List;



import java.util.LinkedList;
import java.util.ListIterator;


public class EjemploLinkedList {
    public static void main(String[] args) {

        LinkedList<Alumno> enlazada = new LinkedList<>();
        //tiene otros metodos que permiten manipular mas facil los datos que con un arraylist


        System.out.println(enlazada  + " tamaño ="+ enlazada.size());
        System.out.println("Está vacía = " +enlazada.isEmpty());
        enlazada.add(new Alumno("Pato", 5 ));
        enlazada.add(new Alumno("Cata", 6 ));
        enlazada.add(new Alumno("Luis", 9 ));
        enlazada.add( new Alumno("Jano", 6 ));
        enlazada.add(new Alumno("Lucio", 3 ));


        System.out.println(enlazada  + " tamaño ="+ enlazada.size());

        enlazada.addFirst(new Alumno("Zeus", 5));
        enlazada.addLast(new Alumno("Camilo", 10));
        System.out.println(enlazada  + " tamaño ="+ enlazada.size());

        System.out.println("Primero = " +enlazada.getFirst());
        System.out.println("Último = "+ enlazada.getLast());
        System.out.println("obtener indice 2 " + enlazada.get(2));
        System.out.println("ultimo con peekLast() = " + enlazada.peekLast()); //retorna null si no hay un elemento en la lista pero no lanza una excepción


        enlazada.removeFirst(); //si es null lanza excepción
        enlazada.removeLast();
        System.out.println();
       // al.pollFirst(); //elimina pero no lanza excepcion si la lista es null
        System.out.println(enlazada  + " tamaño ="+ enlazada.size());

        System.out.println();
        enlazada.remove(new Alumno("Jano", 6));
        System.out.println(enlazada  + " tamaño ="+ enlazada.size());

        System.out.println();
        Alumno a = new Alumno ("Lucas", 5);

        enlazada.addLast(a);
        System.out.println("Indice de lucas: " + enlazada.indexOf(a));

        enlazada.remove(2);
        System.out.println();
        System.out.println(enlazada  + " tamaño ="+ enlazada.size());
        System.out.println("Indice de lucas: " + enlazada.indexOf(a));
        System.out.println();

        enlazada.set(3, new Alumno("Lalo", 7));
        System.out.println(enlazada  + " tamaño ="+ enlazada.size());

        ListIterator<Alumno> li = enlazada.listIterator();

        while(li.hasNext()){ //lista en orden
            Alumno alumno = li.next();
            System.out.println("alumno = " + alumno);

        }
        System.out.println();
        while (li.hasPrevious()){ //lista en orden invertido
            Alumno alumno = li.previous();
            System.out.println("alumno = " + alumno);
        }

        }

    }


