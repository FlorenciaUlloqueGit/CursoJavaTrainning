package PatronObserver.Observer2;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio extends Observable{
    private List<String> repo = new ArrayList<>();

    public void crearUsuario(String usuario){
        repo.add(usuario);
        notificarObservadores(usuario);
    }


}
