package Tarea;

public class Electronico extends Producto implements iElectronico{
   private String fabricante;

    @Override
    public String getFabricante() {
        return fabricante;
    }

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }


}
