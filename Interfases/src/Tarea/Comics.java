package Tarea;

import java.util.Date;

public class Comics extends Libro implements IProducto {

    private String personaje;

    public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
    }

    public String getPersonaje() {
        return personaje;
    }


    @Override
    public double getPrecioVenta() {
        return getPrecio() *0.4;
    }
}
