package PatronFactory.Producto;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaProducto {
    protected String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;


    public PizzaProducto(){
        this.ingredientes = new ArrayList<>();
    }
    public void preparar(){
        System.out.println("Preparando " + nombre);
        System.out.println("seleccionando la masa " + masa);
        System.out.println("agregando salsa " + salsa);
        System.out.println("Agregando ingredientes: " );
       this.ingredientes.forEach(System.out::println);
    }

    public void empaquetar(){
        System.out.println("Poniendo la pizza en la caja");

    }
    public abstract void cocinar();
    abstract public void cortar();

    @Override
    public String toString() {
        return "PizzaProducto{" +
                "nombre='" + nombre + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }

    public String getNombre() {
        return nombre;
    }


}

