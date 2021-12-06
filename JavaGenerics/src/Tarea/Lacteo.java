package Tarea;

public class Lacteo  extends Producto{
    private int cant;
    private int proteinas;

    public Lacteo(String nombre, double precio) {
        super(nombre, precio);
    }

    public Lacteo(String nombre, double precio, int cant, int proteinas) {
        super(nombre, precio);
        this.cant = cant;
        this.proteinas = proteinas;
    }

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
}
