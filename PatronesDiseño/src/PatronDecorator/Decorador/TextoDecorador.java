package PatronDecorator.Decorador;

public  abstract class TextoDecorador  implements Formateable {
    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }

}
