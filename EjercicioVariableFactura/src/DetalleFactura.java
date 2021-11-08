
import java.util.Scanner;

public class DetalleFactura {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de facturación");

        System.out.println("Por favor, Ingrese el nombre o descripción de la factura");
        String nombre = scan.nextLine();
        System.out.println("Ingrese un precio de un producto");
        double precio1 = scan.nextDouble();
        System.out.println("Ingrese el precio de otro producto");
        double precio2 = scan.nextDouble();

        double totalBruto = (precio1 + precio2);
        double total = (precio1 + precio2) *1.19;
        double impuesto = (precio1 + precio2) * 0.19;

        String mensaje = "La factura "+ nombre + "tiene un total bruto de $" +totalBruto +
                " con un impuesto de $" +impuesto+ " y el monto total es de $" + total;
        System.out.println(mensaje);


    }
}
