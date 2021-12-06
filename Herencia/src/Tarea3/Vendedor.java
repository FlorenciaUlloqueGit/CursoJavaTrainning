package Tarea3;

public class Vendedor  extends Persona{
    private int idVendedor;

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public Vendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public Vendedor(String nombre, String apellido, int idVendedor) {
        super(nombre, apellido);
        this.idVendedor = idVendedor;
    }

    @Override
    public String toString() {
        return super.toString() + " Id vendedor " + getIdVendedor();
    }
}
