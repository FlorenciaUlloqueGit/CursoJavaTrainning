public class DivisionPorCeroException extends Exception{

    public DivisionPorCeroException(String mensaje){
        super(mensaje); //le pasamos al padre la excepción.
    }
}
