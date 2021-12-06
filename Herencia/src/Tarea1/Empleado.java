package Tarea1;

public class Empleado extends Persona {
    private double remuneracion;
    private int empleadoId;

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public Empleado(double remuneracion, int empleadoId) {
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public Empleado(String nombre, String apellido, String numFiscal, String direccion, double remuneracion, int empleadoId) {
        super(nombre, apellido, numFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    @Override
    public String toString() {
        return super.toString() + "\n remuneración = " + getRemuneracion() +
                " idEmpleado = " + getEmpleadoId();
    }

    public double aumentarRemuneracion(int porcentaje){
        remuneracion  = (remuneracion * porcentaje / 100) + remuneracion;
        return remuneracion;
    }
}
