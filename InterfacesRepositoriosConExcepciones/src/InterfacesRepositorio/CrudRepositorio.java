package InterfacesRepositorio;

import InterfacesRepositorio.Excepciones.LecturaAccesoDatoException;

import java.util.List;
import InterfacesRepositorio.Excepciones.AccesoDatoExcepcion;

public interface CrudRepositorio {
    List<Cliente> listar();


    Cliente porId(Integer id) throws  AccesoDatoExcepcion;

    void CrearCliente(Cliente cliente) throws AccesoDatoExcepcion;

    void editar(Cliente cliente) throws LecturaAccesoDatoException;
    void eliminar(Integer id) throws LecturaAccesoDatoException;

}
