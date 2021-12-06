package InterfacesRepositorio;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde , int hasta);
}
