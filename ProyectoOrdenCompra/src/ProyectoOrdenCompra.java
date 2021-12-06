import java.util.Date;

public class ProyectoOrdenCompra {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("juan", "carlos");
        Date fecha1 = new Date(03 / 06 / 1995);

        Producto productosA[] = new Producto[4];
        Producto producto1 = new Producto("Arcor", "caramelo", 100);
        Producto producto2 = new Producto("Mogui", "caramelo gelatina ", 150);
        Producto producto3 = new Producto("Arcor", "turron", 120);
        Producto producto4 = new Producto("Oblea", "galleta", 130);


        OrdenCompra orden1 = new OrdenCompra("Orden 1");
        orden1.setFecha(fecha1);
        orden1.setCliente(cliente1);
        productosA[0] = producto1;
        productosA[1] = producto2;
        productosA[2] = producto3;
        productosA[3] = producto4;

        /*
        for (int i = 0; i < productosA.length; i++) {
            orden1.addProducto(new Producto(productosA[i].getFabricante(), productosA[i].getNombre(), productosA[i].getPrecio()));

        }

         */
        orden1.addProducto(producto1);
        orden1.addProducto(producto2);
        orden1.addProducto(producto3);
        orden1.addProducto(producto4);


        System.out.println("Orden de compra 1  ");
        System.out.println("Datos: ");
        System.out.println(orden1.getCliente().getNombre() + " " + orden1.getCliente().getApellido() + ",  " + orden1.getFecha() + " " + orden1.getDescripcion());

        System.out.println("El costo total de la orden es de $" + orden1.calcularTotal(productosA));
        for (int i = 0; i < productosA.length; i++) {
            System.out.println(productosA[i].getNombre() + " " + productosA[i].getPrecio() + " " + productosA[i].getFabricante());


        }


        Cliente cliente2 = new Cliente("juana", "viale");
        Date fecha2 = new Date(010 / 06 / 2005);

        Producto productosB[] = new Producto[4];
        Producto producto5 = new Producto("Arcor", "paleta", 130);
        Producto producto6 = new Producto("Mogui", "caramelo acido", 155);
        Producto producto7 = new Producto("Arcor", "turron dulce", 120);
        Producto producto8 = new Producto("Oblea", "galleta oreo", 130);


        OrdenCompra orden2 = new OrdenCompra("Orden 2");
        orden2.setFecha(fecha2);
        orden2.setCliente(cliente2);
        productosB[0] = producto5;
        productosB[1] = producto6;
        productosB[2] = producto7;
        productosB[3] = producto8;

        /*
        for (int i = 0; i < productosA.length; i++) {
            orden1.addProducto(new Producto(productosA[i].getFabricante(), productosA[i].getNombre(), productosA[i].getPrecio()));

        }

         */
        orden2.addProducto(producto5);
        orden2.addProducto(producto6);
        orden2.addProducto(producto7);
        orden2.addProducto(producto8);


        System.out.println("Orden de compra 2  ");
        System.out.println("Datos: ");
        System.out.println(orden2.getCliente().getNombre() + " " + orden2.getCliente().getApellido() + ",  " + orden2.getFecha() + " " + orden2.getDescripcion());

        System.out.println("El costo total de la orden es de $" + orden2.calcularTotal(productosB));
        for (int i = 0; i < productosB.length; i++) {
            System.out.println(productosB[i].getNombre() + " " + productosB[i].getPrecio() + " " + productosB[i].getFabricante());


        }


        Cliente cliente3 = new Cliente("oscar", "viale");
        Date fecha3 = new Date(05 / 06 / 2010);

        Producto productosC[] = new Producto[4];
        Producto producto9 = new Producto("Arcor", "paleta", 180);
        Producto producto10 = new Producto("Mogui", "caramelo acido", 155);
        Producto producto11 = new Producto("Arcor", "turron dulce", 170);
        Producto producto12 = new Producto("Oblea", "galleta oreo", 100);


        OrdenCompra orden3 = new OrdenCompra("Orden 3");
        orden3.setFecha(fecha3);
        orden3.setCliente(cliente3);
        productosC[0] = producto9;
        productosC[1] = producto10;
        productosC[2] = producto11;
        productosC[3] = producto12;

        /*
        for (int i = 0; i < productosA.length; i++) {
            orden1.addProducto(new Producto(productosA[i].getFabricante(), productosA[i].getNombre(), productosA[i].getPrecio()));

        }

         */
        orden3.addProducto(producto9);
        orden3.addProducto(producto10);
        orden3.addProducto(producto11);
        orden3.addProducto(producto12);


        System.out.println("Orden de compra 3  ");
        System.out.println("Datos: ");
        System.out.println(orden3.getCliente().getNombre() + " " + orden3.getCliente().getApellido() + ",  " + orden3.getFecha() + " " + orden3.getDescripcion());

        System.out.println("El costo total de la orden es de $" + orden3.calcularTotal(productosC));
        for (int i = 0; i < productosC.length; i++) {
            System.out.println(productosC[i].getNombre() + " " + productosC[i].getPrecio() + " " + productosC[i].getFabricante());
        }
    }
}






/*
La tarea es crear un proyecto nuevo llamado ProyectoOrdenCompra de la siguiente manera:

Se requiere crear la clase OrdenCompra con los siguientes campos privados: identificador tipo Integer autoincremental, descripcion String,
fecha tipo Date, cliente del tipo Cliente y finalmente un atributo de tipo arreglo de productos con 4 elementos: Producto[] productos.



Respecto a los productos de la clase OrdenCompra, sólo se pueden agregar usando el método public void addProducto (Producto producto),
nada más, es decir no se pueden agregar en el constructor ni en métodos setter.

La clase OrdenCompra debe tener un método que devuelva el gran total, sumando los precios de los productos.



Escribir un programa, clase con método main, la cual llamaremos EjemploOrdenes:

Crear tres órdenes, con sus respectivos valores, el cliente, agregar los cuatro productos a cada una, cada orden con distintos productos, que no se repitan.

Para cada una imprimir sus valores en consola usando método getter incluyendo los productos,
 donde con el método getter obtenemos el arreglo de productos y con un foreach recorremos e imprimimos sus atributos fabricante, nombre y precio.
  Tener en cuenta en la salida el gran total de cada orden, los clientes etc
 */

