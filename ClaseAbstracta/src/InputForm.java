public class InputForm  extends ElementosForm{



    private String tipo = "text";

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    @Override
    public String dibujarHtml() {
        return "<input type= '" + tipo+ "' name= '"+ nombre+ "' value= '" + valor+"'>";
    }
}
