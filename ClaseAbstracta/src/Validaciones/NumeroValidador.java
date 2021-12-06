package Validaciones;

public class NumeroValidador extends Validador{

    protected String mensaje = "el campo  %s debe ser un número";
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
        try{
            Integer.parseInt(valor);
            return true;
        }catch (Exception e ){
            return false;
        }

    }
}
