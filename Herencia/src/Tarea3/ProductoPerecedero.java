package Tarea3;

import java.util.Date;

public class ProductoPerecedero extends Producto {
    private Date fechaVencimiento;

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public ProductoPerecedero(String nombre, double precio, Date fechaVencimiento) {
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return super.toString() + " /n fecha Vencimiento = " + fechaVencimiento;
    }
}
