import Validaciones.MensajeFormateable;
import Validaciones.Validador;

import java.util.ArrayList;
import java.util.List;

public abstract class ElementosForm {
    protected String valor;
    protected String nombre;


    private List<Validador> validadores;

    public List<String> getErrores() {
        return errores;
    }

    private List<String> errores;

    public String getNombre() {
        return nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public ElementosForm() {
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public void addValidador(Validador validador) {
        this.validadores.add(validador);

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ElementosForm(String nombre) {
        this(); //llama al constructor vacío.
        this.nombre = nombre;
    }

    public boolean esValido() {
        for (Validador v : validadores) {
            if (!v.esValido(this.valor)) {
                if (v instanceof MensajeFormateable) {
                    this.errores.add(((MensajeFormateable) v).getMensajeFormateado(nombre));
                } else {
                    this.errores.add(String.format(v.getMensaje(), nombre));
                }
            }


        }
        return this.errores.isEmpty();

    }

     abstract public String dibujarHtml();
}

