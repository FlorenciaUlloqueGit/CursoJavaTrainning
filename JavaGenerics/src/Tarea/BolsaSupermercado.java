package Tarea;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BolsaSupermercado<T> implements Iterable {
    private int max;
    private List<T> productos;

    public BolsaSupermercado(int max) {
        this.max = max;
        this.productos =new ArrayList<>();
    }



    public void addProductos(T p){
        if(this.productos.size() <= max){
            this.productos.add(p);
        }else{
            System.out.println( "Se llegó al límite de agregación de productos a la bolsa");
        }
    }

    public List<T> getProductos() {

        return productos;
    }

    @Override
    public Iterator iterator() {
        return this.productos.iterator();
    }
}
