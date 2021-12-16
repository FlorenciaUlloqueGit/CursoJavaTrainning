package Tarea;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        LinkedList<Vuelo> listado = new LinkedList<>();



        listado.add(new Vuelo("AAL993", "Nueva york", "Santiago",new Date("10/10/2021 10:50"), 62));
        listado.add(new Vuelo("UUL993", "Miami", "Santiago",new Date("11/18/2021 10:00"), 60));
        listado.add(new Vuelo("eel345", "Londres", "Santiago",new Date("10/15/2021 10:50"), 58));
        listado.add(new Vuelo("EMF464", "Bogota", "Santiago",new Date("09/08/2021 10:50"), 29));


        System.out.println("Listado de vuelos ");
        listado.sort(Comparator.comparing(Vuelo::getFechaYHora));
        System.out.println(listado);

        System.out.println("El último vuelo es despegar es " +  listado.getLast());


        listado.sort(Comparator.comparing(Vuelo::getPasajeros));

        System.out.println("El vuelo con menor cantidad de pasajeros es: " + listado.getFirst());


    }
}
