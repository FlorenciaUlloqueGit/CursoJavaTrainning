package Validaciones;

public class LargoValidador  extends Validador implements MensajeFormateable{

    protected String mensaje= "el campo %s debe tener mínimo %d caracteres y máximo %d caracteres";
    private int min; //el mensaje es una plantilla dodne se van a reemplazar valores
    private int max = Integer.MAX_VALUE;
    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return null;
    }

    @Override
    public boolean esValido(String valor) {
      //  this.mensaje = String.format(this.mensaje, this.min, this.max);
        if(valor == null){
            return true;
        }
        int largo = valor.length();
        return (largo >= min && largo<=max) == false;

    }
  //  public String getMensajeFormateado(String campo){
    //    return String.format(this.mensaje, campo, this.min, this.max);
    //}

    public LargoValidador( int min, int max) {

        this.min = min;
        this.max = max;
    }

    public LargoValidador() {
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }
    @Override //la interface obliga a implementar este método
    public String getMensajeFormateado(String campo){
        return null;
    }

}
