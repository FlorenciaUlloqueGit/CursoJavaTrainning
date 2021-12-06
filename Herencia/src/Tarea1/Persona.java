package Tarea1;

public class Persona {
    private String nombre;
    private String apellido;
    private String numFiscal;
    private String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumFiscal() {
        return numFiscal;
    }

    public void setNumFiscal(String numFiscal) {
        this.numFiscal = numFiscal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Persona() {
    }

    public Persona(String nombre, String apellido, String numFiscal, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numFiscal = numFiscal;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return
                " nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numFiscal='" + numFiscal + '\'' +
                ", direccion='" + direccion;
    }
}
