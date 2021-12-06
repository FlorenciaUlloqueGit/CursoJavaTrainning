package Validaciones;

public class EmailValidador extends Validador{

    protected String mensaje = "formato email invalido";
    private final static String EMAIL_REGEX = "^(.+)@(.+)$"; //estecartacter regula la busqueda desde el comienzo de la linea. busca desde el comienzo de la expresión reguluar. El signo peso es al final
    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;

    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return valor.matches(EMAIL_REGEX);
    }
}
