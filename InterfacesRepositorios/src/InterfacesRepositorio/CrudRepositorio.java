package InterfacesRepositorio;
import java.util.List;

public interface CrudRepositorio {
    List<Cliente> listar();


    Cliente porId(Integer id);

    void CrearCliente(Cliente cliente);

    void editar(Cliente cliente);
    void eliminar(Integer id);

}
