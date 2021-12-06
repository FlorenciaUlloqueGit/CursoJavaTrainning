package Generics;

import InterfacesRepositorio.Modelo.Cliente;
import InterfacesRepositorio.Modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>(); //añ no especificar entre <> el objeto se trabaja con un objeto generico object
        clientes.add(new Cliente("Andres", "guzman"));

        // Cliente andres = (Cliente) clientes.get(0); //se castea asi clientes pasa a ser Cliente en vez de object
        Cliente andres = clientes.iterator().next(); //obtiene el primer elemento del arreglo

        Cliente[] clientesArreglo = {new Cliente("Andres", "guzman"),
                new Cliente("florencia ", "Ulloque")};

        Integer[] enterosArreglo = {1, 2, 3};


        List<Cliente> clientesLista = fromArrayToList(clientesArreglo); //convierto el arreglo generico en uno específico
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        System.out.println("===============================");

        List<String> nombres = fromArrayToList(new String[]{"Lucio", "Miguel", "juvenal", "Karol"}, enterosArreglo);

        nombres.forEach(System.out::println);
        System.out.println("===============================");

        List<ClientePremium> clientePremiumsList = fromArrayToList(
                new ClientePremium[]{new ClientePremium("Paco", "Fernandez")});

        clientePremiumsList.forEach(System.out::println);
        System.out.println("===============================");
        System.out.println("Método imprimir clientes");
        imprimirClientes(clientes);
        System.out.println();
        imprimirClientes(clientesLista);
        System.out.println();
        imprimirClientes(clientePremiumsList);


        System.out.println("Máximo de 1, 9 y 4 es: " + maximo(1, 9, 4));
        System.out.println("Máximo de 3.9, 3.6 y 11.6 es: " + maximo(3.9, 3.6, 11.6));
        System.out.println("Máximo de zanahoria, arandanos , manzana es: "
                + maximo("zanahoria", "arandanos", "manzana"));

    }

    //la idea es convertir un arreglo de algun tipo de objeto en un tipo List del tipo cliente.

    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);//el metodo asList recibe un arreglo y lo convierte en una lista
    } //Este metodo generico nos permite pasar por parametro cualquier clase y no solo una clase especificada por parámetro. lo hace más reutilizable.


    public static List<Cliente> fromArrayToListNoGenerico(Cliente[] c) {
        return Arrays.asList(c); //EJEMPLO NO GENERICO, AL TENER CLIENTE ENTRE LOS DIAMANTES.
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] g) {
        for (G elemento : g) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);//el metodo asList recibe un arreglo y lo convierte en una lista
    } //Este metodo generico nos permite pasar por parametro cualquier clase y no solo una clase especificada por parámetro. lo hace más reutilizable.


    public static <T extends Number> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);//el metodo asList recibe un arreglo y lo convierte en una lista
    }


    // public static <T extends Cliente>List<T> fromArrayToList(T[] c){
    //   return Arrays.asList(c) ;//el metodo es generico si tiene clases hijas, ya que puede llamar a las hijas tambien
    //}


    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);//acepta que cliente implemente la interfaz comparable y acepta el objeto cliente con su descendencia
    }


    public static void imprimirClientes(List<? extends Cliente> clientes) { // para que una lista acepte clases hijas de Cliente
        clientes.forEach(System.out::println);

    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }


}
