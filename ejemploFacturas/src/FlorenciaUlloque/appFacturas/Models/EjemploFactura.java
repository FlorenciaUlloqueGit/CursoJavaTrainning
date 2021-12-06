package FlorenciaUlloque.appFacturas.Models;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setIdentfiscal("555-4");
        cliente.setNombre("oscar");


        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la descripcion de la factura");
        String desc = scanner.next();
        Factura fac = new Factura(desc, cliente);

        Producto prod;

        System.out.println();
        for (int i = 0; i < 5; i++) {
            prod = new Producto();


            System.out.println("Ingrese el precio");
            prod.setPrecio(scanner.nextFloat());
            System.out.println("Ingrese el nombre del producto");
            prod.setNombre(scanner.next());

            System.out.println("ingrese la cantidad");;


            fac.additemDetalle( new DetalleFactura(scanner.nextInt(), prod);
            System.out.println();

        };

        System.out.println(fac.generarDetalle());


    }

}
