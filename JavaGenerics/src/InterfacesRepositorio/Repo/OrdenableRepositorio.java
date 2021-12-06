package InterfacesRepositorio.Repo;

import InterfacesRepositorio.Modelo.Direccion;

import java.util.List;

public interface OrdenableRepositorio<T> {
    List<T> listar(String campo, Direccion dir);


}
