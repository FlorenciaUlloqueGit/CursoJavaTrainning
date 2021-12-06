package FlorenciaUlloque.appFacturas.Models;

public class Producto {
    private int cod;
    private float precio;
    private String nombre;
    private static int ultimoCod;


    public Producto() {
        this.cod = ++ultimoCod;
    }

    public int getCod() {
        return cod;
    }



    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*public Producto(int cod, float precio, String nombre) {
        this.cod = cod;
        this.precio = precio;
        this.nombre = nombre;

     */

}
