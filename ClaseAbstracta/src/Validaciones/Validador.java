package Validaciones;

abstract public class Validador {
    protected String mensaje;

    abstract public void setMensaje(String mensaje);
    abstract public String getMensaje();



    public Validador() {
    }

    abstract public boolean esValido(String valor);
}
