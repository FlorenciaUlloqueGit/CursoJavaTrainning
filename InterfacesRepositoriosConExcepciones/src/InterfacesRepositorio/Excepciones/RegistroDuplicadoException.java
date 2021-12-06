package InterfacesRepositorio.Excepciones;

public class RegistroDuplicadoException  extends EscrituraAccesoDatoException{
    public RegistroDuplicadoException(String message) {
        super(message);
    }
}
