package Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion <T>implements Iterable<T>{ //es iterable camion en la clase main porque implementa la interfaz iterable
    private List <T> objetos;
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList<>();
    }



    public void agregarObjeto(T objeto) {
        if (this.objetos.size() <= max)
            this.objetos.add(objeto);
        else
            throw new RuntimeException("No hay mas espacio");
    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }
}
