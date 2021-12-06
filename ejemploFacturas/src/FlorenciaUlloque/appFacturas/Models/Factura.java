package FlorenciaUlloque.appFacturas.Models;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Factura {
    private int numFactura;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private DetalleFactura[] detalle;
    private int indiceItems;
    private static int ultimoNumFact;


    public static final int Max_Items = 10;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.detalle = new DetalleFactura[Max_Items];
        this.numFactura = ++ultimoNumFact;
        this.fecha = new Date();
    }

    public DetalleFactura[] getDetalle() {
        return detalle;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumFactura() {
        return numFactura;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void additemDetalle(DetalleFactura detalle) {
        if (indiceItems < Max_Items) {
            this.detalle[indiceItems++] = detalle;
        }

    }

    public float calcularTotal() {
        float total = 0.0f;

        for (DetalleFactura detalle : this.detalle) {
            if (detalle == null) {
                continue;
            }
            total += detalle.calcularImporte();

        }
        return total;
    }

    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura n°: ");
        sb.append(numFactura).append("\n Cliente: ")
                .append(this.cliente.getNombre())
                .append(" \t NIF : ")
                .append(cliente.getIdentfiscal())
                .append("\n descripcion: ")
                .append(this.descripcion)
                .append("\n")
                .append("\n#\tNombre\tcant. \tTotal\n");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy");

        sb.append("Fecha Emisión: ").append(dateFormat.format(this.fecha))
                .append("\n");



        for (DetalleFactura detalle : this.detalle ) {
           if(detalle == null){
               continue;
           }
           sb.append(detalle.getProducto().getCod())
                   .append("\t")
                   .append(detalle.getProducto().getNombre())
                   .append("\t")
                   .append(detalle.getProducto().getPrecio())
                   .append("\t")
                   .append(detalle.getCant())
                   .append("\n")
                   .append(detalle.calcularImporte())
                   .append("\n");

           sb.append("\n total de la factura: $")
                   .append(calcularTotal());
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Factura{" +
                "numFactura=" + numFactura +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", cliente=" + cliente +
                ", detalle=" + Arrays.toString(detalle) +
                ", indiceItems=" + indiceItems +
                '}';
    }
}
