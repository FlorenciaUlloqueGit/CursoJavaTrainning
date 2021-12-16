package PatronDecorator.Decorador;

public class MayusculaDecorador extends TextoDecorador {
    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }


    public MayusculaDecorador(Formateable texto) {
        super(texto);
    }

}
