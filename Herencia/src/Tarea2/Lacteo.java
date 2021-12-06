package Tarea2;

public class Lacteo extends Producto{
    private int cant;
    private int proteinas;

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    public Lacteo(String nombre, double precio, int cant, int proteinas) {
        super(nombre, precio);
        this.cant = cant;
        this.proteinas = proteinas;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\n cantidad=" + cant +
                ", proteinas=" + proteinas;
    }
}
