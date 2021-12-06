package InterfacesRepositorio.Repo.Listas;

import InterfacesRepositorio.Modelo.AbstractaListRepositorio;
import InterfacesRepositorio.Modelo.Cliente;
import InterfacesRepositorio.Modelo.Direccion;
import InterfacesRepositorio.Modelo.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoListRepositorio extends AbstractaListRepositorio<Producto> {
    @Override
    public void editar(Producto prod) {

        Producto p = this.porId((prod.getId()));
        p.setDescripcion(prod.getDescripcion());
        p.setPrecio(prod.getPrecio());

    }

    @Override
    public List<Producto> listar(String campo, Direccion dir) {
        List<Producto> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a,  b) ->{
            int resultado = 0;
            if(dir == Direccion.ASC){
                resultado = ordenar(campo, a, b);
            }else if (dir == Direccion.DESC){
                resultado = ordenar(campo, b, a);
            }

            return resultado;
        });
        return listaOrdenada;

    }
    public static int ordenar(String campo, Producto a, Producto b){
        int resultado = 0;

        switch (campo){
            case "id" ->
                    resultado = b.getId().compareTo(a.getId());
            case "descripcion" ->
                    resultado = b.getDescripcion().compareTo(a.getDescripcion());
            case "apellido" ->
                    resultado = b.getPrecio().compareTo(a.getPrecio());
        }
        return resultado;
    }
}
