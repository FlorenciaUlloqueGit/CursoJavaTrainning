package PatronDecorator.Decorador;

public class ReemplazarEspaciosDecorador extends TextoDecorador{
    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ", "_");
    }

    public ReemplazarEspaciosDecorador(Formateable texto) {
        super(texto);
    }
}
