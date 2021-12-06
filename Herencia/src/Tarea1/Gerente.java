package Tarea1;

public class Gerente extends Empleado{
    private double presupuesto;

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Gerente(double remuneracion, int empleadoId, double presupuesto) {
        super(remuneracion, empleadoId);
        this.presupuesto = presupuesto;
    }

    public Gerente(String nombre, String apellido, String numFiscal, String direccion, double remuneracion, int empleadoId, double presupuesto) {
        super(nombre, apellido, numFiscal, direccion, remuneracion, empleadoId);
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Presupuesto = " + getPresupuesto();
    }
}
