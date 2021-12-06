package InterfacesRepositorio;

import InterfacesRepositorio.Modelo.Cliente;
import InterfacesRepositorio.Modelo.Direccion;
import InterfacesRepositorio.Modelo.Producto;
import InterfacesRepositorio.Repo.Listas.ClienteListRepositorio;
import InterfacesRepositorio.Repo.Listas.ProductoListRepositorio;
import InterfacesRepositorio.Repo.OrdenablePaginableCrudRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {
 public static void main(String[] args) {

  OrdenablePaginableCrudRepositorio <Producto> repo = new ProductoListRepositorio();

  repo.Crear(new Producto("mesa", 14000d));
  repo.Crear(new Producto("sillas x6 ", 10000d));
  repo.Crear(new Producto("comoda", 18000d));
  repo.Crear(new Producto("espejo", 3000d));


  List<Producto> productos = repo.listar();
  productos.forEach(System.out::println);
  System.out.println("============== paginable ======================");
  List<Producto> paginable = (repo).listar(1, 4);
  paginable.forEach(System.out::println);

  System.out.println("=============== ordenar =====================");
  List<Producto> ClientesOrdenAsc = (repo).listar("apellido", Direccion.DESC);
  for (Producto p : ClientesOrdenAsc) {
   System.out.println(p);

  }

  System.out.println("==========editar==============");
  Producto lamparaActualizar = new Producto("lampara", 5000d);
  lamparaActualizar.setId(4);
  repo.editar(lamparaActualizar);
  Producto lampara = repo.porId(4);
  System.out.println(lampara);


  List<Producto> productosOrdenados = (repo).listar("descripcion", Direccion.DESC);
  for (Producto p : productosOrdenados) {
   System.out.println(p);


  }
  System.out.println("==========eliminar==============");
  //repo.eliminar(2);
  repo.listar().forEach(System.out::println);
  System.out.println("==========Total==============");

  System.out.println(repo.total());
 }
}



