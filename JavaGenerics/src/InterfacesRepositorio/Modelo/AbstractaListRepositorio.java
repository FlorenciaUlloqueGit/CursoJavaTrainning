package InterfacesRepositorio.Modelo;

import InterfacesRepositorio.Repo.OrdenablePaginableCrudRepositorio;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractaListRepositorio <T extends BaseEntity> implements OrdenablePaginableCrudRepositorio <T>{


   protected  List<T> dataSource;

    public AbstractaListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }


    @Override
    public T porId(Integer id) {
        T c = null;
        for (T cli : dataSource) {
            if (cli.getId().equals(id)) {
                c = cli;
                break;
            }

        }
        return c;
    }





    @Override
    public void Crear(T t) {
           this.dataSource.add(t);

    }


    @Override
    public void eliminar(Integer id) {
        T t = this.porId(id);
        this.dataSource.remove(t);

    }



    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }


    @Override
    public int total() {
        return this.dataSource.size();
    }
}
