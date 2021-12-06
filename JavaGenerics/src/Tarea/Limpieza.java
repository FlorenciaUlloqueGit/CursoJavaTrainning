package Tarea;

public class Limpieza extends Producto {
    private String componente;
    private double litros;

    public Limpieza(String nombre, double precio) {
        super(nombre, precio);
    }

    public String getComponente() {
        return componente;
    }

    public void setComponente(String componente) {
        this.componente = componente;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public Limpieza(String nombre, double precio, String componente, double litros) {
        super(nombre, precio);
        this.componente = componente;
        this.litros = litros;
    }
}
