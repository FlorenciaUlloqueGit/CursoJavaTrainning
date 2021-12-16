package PatronDecorator.Decorador;

public class SubrayadoDecorador  extends TextoDecorador{
    @Override
    public String darFormato() {
        int largo = texto.darFormato().length();
        StringBuilder sb = new StringBuilder(texto.darFormato());
        sb.append("\n ");
        for (int i = 0; i <largo ; i++) {
            sb.append("_");
        }
        return sb.toString();
    }

    public SubrayadoDecorador(Formateable texto) {
        super(texto);
    }
}
