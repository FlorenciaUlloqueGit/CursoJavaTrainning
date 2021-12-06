package InterfacesRepositorio.Repo;


import java.util.List;

public interface CrudRepositorio<T> {
    List<T> listar();


    T porId(Integer id);

    void Crear(T objeto);

    void editar(T objeto);
    void eliminar(Integer id);

}
