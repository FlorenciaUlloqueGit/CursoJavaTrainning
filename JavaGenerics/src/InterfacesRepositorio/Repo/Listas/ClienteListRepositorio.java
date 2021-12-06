package InterfacesRepositorio.Repo.Listas;

import InterfacesRepositorio.Modelo.AbstractaListRepositorio;
import InterfacesRepositorio.Modelo.Cliente;
import InterfacesRepositorio.Modelo.Direccion;

import java.util.List;

public  class ClienteListRepositorio extends AbstractaListRepositorio<Cliente> {




    @Override
    public void editar(Cliente cliente) {

           Cliente c = this.porId(cliente.getId());
           c.setNombre(cliente.getNombre());
           c.setApellido(cliente.getApellido());
    }
    




    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        dataSource.sort((Cliente a, Cliente b) ->{
                int resultado = 0;
                if(dir == Direccion.ASC){
                    switch (campo){
                        case "id" ->
                                resultado = a.getId().compareTo(b.getId());
                        case "nombre" ->
                                resultado = a.getNombre().compareTo(b.getNombre());
                        case "apellido" ->
                                resultado = a.getApellido().compareTo(b.getApellido());
                    }

                }else if(dir == Direccion.DESC){
                    switch (campo){
                        case "id" ->
                                resultado = b.getId().compareTo(a.getId());
                        case "nombre" ->
                                resultado = b.getNombre().compareTo(a.getNombre());
                        case "apellido" ->
                                resultado = b.getApellido().compareTo(a.getApellido());
                    }

                }

            return resultado;
        });
        return dataSource;

    }




}
