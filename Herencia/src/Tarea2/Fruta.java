package Tarea2;

public class Fruta  extends Producto{
    private double peso;
    private String color;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fruta(String nombre, double precio, double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }



    @Override
    public String toString() {
        return super.toString() +  "\n peso=" + peso +
                ", color='" + color;
    }
}
