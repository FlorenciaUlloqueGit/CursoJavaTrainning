package InterfacesRepositorio;

import InterfacesRepositorio.Excepciones.AccesoDatoExcepcion;
import InterfacesRepositorio.Excepciones.EscrituraAccesoDatoException;
import InterfacesRepositorio.Excepciones.LecturaAccesoDatoException;
import InterfacesRepositorio.Excepciones.RegistroDuplicadoException;

import java.util.ArrayList;
import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

     try {
      OrdenablePaginableCrudRepositorio repo = new ClienteListRepositorio();

      repo.CrearCliente(new Cliente("Jano", "Perez"));
      repo.CrearCliente(new Cliente("Bea", "Gonzalez"));
      repo.CrearCliente(new Cliente("Luci", "Martinez"));
      repo.CrearCliente(new Cliente("Andres", "Guzman"));
      Cliente Florencia = new Cliente ("florencia ","Ulloque");
      repo.CrearCliente(Florencia);
      repo.CrearCliente(Florencia); //las listas permiten datos duplicados, por lo que hay que tener cuidado con el id y se debe manejar el error


    //  repo.CrearCliente(null);

      List<Cliente> clientes = repo.listar();
      clientes.forEach(System.out::println);
      System.out.println("============== paginable ======================");
      List<Cliente> paginable = (repo).listar(1, 4);
      paginable.forEach(System.out::println);

      System.out.println("=============== ordenar =====================");
      List<Cliente> ClientesOrdenAsc = (repo).listar("apellido", Direccion.DESC);
      for (Cliente c : ClientesOrdenAsc) {
       System.out.println(c);

      }

      System.out.println("==========editar==============");
      Cliente beaActualizar = new Cliente("Bea", "Mena");
      beaActualizar.setId(2);
      repo.editar(beaActualizar);
      Cliente bea = repo.porId(2);
      System.out.println(bea);


      List<Cliente> ClientesOrdenAsc2 = (repo).listar("apellido", Direccion.DESC);
      for (Cliente c : ClientesOrdenAsc2) {
       System.out.println(c);


      }
      System.out.println("==========eliminar==============");
      repo.eliminar(1);
      repo.listar().forEach(System.out::println);
      System.out.println("==========Total==============");

      System.out.println(repo.total());
     }
     catch(LecturaAccesoDatoException e){
      System.out.println("Lectura= " +e.getMessage());
      e.printStackTrace();
     } catch (RegistroDuplicadoException e ) {
      System.out.println("RegistroDuplicado= " + e.getMessage());
      e.printStackTrace();
     }catch (EscrituraAccesoDatoException a){
      System.out.println("Escritura= "  +a.getMessage());
      a.printStackTrace();
     }catch (AccesoDatoExcepcion a){
      System.out.println( "Generica" + a.getMessage());
      a.printStackTrace();
     }
 }

     }




