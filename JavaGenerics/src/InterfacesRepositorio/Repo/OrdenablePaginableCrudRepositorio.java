package InterfacesRepositorio.Repo;

public interface OrdenablePaginableCrudRepositorio <T> extends OrdenableRepositorio  <T>,
        PaginableRepositorio  <T>, CrudRepositorio  <T>, ContableRepositorio { //herencia de interfaces en una sola



}
