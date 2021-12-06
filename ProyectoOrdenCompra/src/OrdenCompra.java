import java.util.Date;
public class OrdenCompra {
    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto productos[] = new Producto[5] ;




    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    int indiceProducto = 0;

    public void addProducto(Producto producto){
      this.productos[indiceProducto++] = producto;

        }
        int costo = 0; int total = 0;
        public int calcularTotal(Producto productos[]){
            for (int i = 0; i < productos.length; i++) {
                costo = productos[i].getPrecio();
                total = total + costo;
            }
            return total;
        }


}

/*
Se requiere crear la clase OrdenCompra con los siguientes campos privados: identificador tipo Integer autoincremental, descripcion String,
fecha tipo Date, cliente del tipo Cliente y finalmente un atributo de tipo arreglo de productos con 4 elementos: Producto[] productos.



Respecto a los productos de la clase OrdenCompra, sólo se pueden agregar usando el método public void addProducto (Producto producto),
nada más, es decir no se pueden agregar en el constructor ni en métodos setter.

La clase OrdenCompra debe tener un método que devuelva el gran total, sumando los precios de los productos.
 */

