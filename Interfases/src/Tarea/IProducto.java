package Tarea;

public interface IProducto {

    default int getPrecio() {
        return 0;
    }

    double getPrecioVenta();



}
