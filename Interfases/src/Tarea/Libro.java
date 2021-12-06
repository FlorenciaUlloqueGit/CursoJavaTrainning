package Tarea;

import java.util.Date;

public class Libro extends Producto implements ILibro{
        private  Date FechaPublicacion;
        private String autor;
        private String titulo;
        private String editorial;

    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        FechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }




    @Override
    public Date getFechaPublicacion() {
        return FechaPublicacion;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() *0.6;
    }
}
