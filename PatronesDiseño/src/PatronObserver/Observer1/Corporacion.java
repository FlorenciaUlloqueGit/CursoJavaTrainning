package PatronObserver.Observer1;

public class Corporacion  extends Observable {

    private  String nombre;
    private int precio;

    public Corporacion(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void modificarPrecio(int precio){
        this.precio = precio;
        notificarObservadores();
    }

    @Override
    public String toString() {
        return   " nuevo precio $ "+
                getPrecio();
    }
}
