package InterfacesRepositorio;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio implements OrdenablePaginableCrudRepositorio {


    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente c = null;
        for (Cliente cli : dataSource) {
            if (cli.getId().equals(id)) {
                c = cli;
                break;
            }

        }
        return c;
    }



    @Override
    public void CrearCliente(Cliente cliente) {
           this.dataSource.add(cliente);

    }

    @Override
    public void editar(Cliente cliente) {

           Cliente c = this.porId(cliente.getId());
           c.setNombre(cliente.getNombre());
           c.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        Cliente c = this.porId(id);
        this.dataSource.remove(c);

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

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }


    @Override
    public int total() {
        return this.dataSource.size();
    }
}
