package FlorenciaUlloque.appFacturas.Models;

public class DetalleFactura {
    private int cant;
    private Producto producto;


    public DetalleFactura(int cant, Producto producto) {
        this.cant = cant;
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public float calcularImporte(){

        return  this.cant * this.producto.getPrecio();
    }

    @Override
    public String toString() {
        return "DetalleFactura{" +
                "cant=" + cant +
                ", producto=" + producto +
                '}';
    }
}

