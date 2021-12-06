package Tarea;

public abstract class Producto implements IProducto {
    private int precio;

    public int getPrecio() {
        return precio;
    }

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public double getPrecioVenta() {
        return precio;
    }
}
