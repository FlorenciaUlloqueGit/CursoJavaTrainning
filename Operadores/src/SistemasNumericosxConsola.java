import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;


public class SistemasNumericosxConsola
{
    public static void main(String[] args) {

        //system.in = entrear datos.... System.out--> salir, mostrar datos.


        Scanner scan  = new Scanner(System.in); //scanner es una clase que permite leer dato por consola.
        System.out.println("Ingrese un número entero");

        int numeroDecimal = 0;
        try {   //para el manejo de errores
        numeroDecimal = scan.nextInt();

        }catch (InputMismatchException e){ //todas las excepciones extienden de exception.... asi que la puedo usar para todas
            System.out.println("Error, debe ingresar un número entero");
            main(args); //para volver a ejecutar lo mismo, se llama al metodo main con sus argumentos.
           // return; //retorna void para salir o sino ...
            System.exit(0); //cero es que no hay problemas
        }

        System.out.println("el número ingresado fue " + numeroDecimal);

        String mensajeBinario = "\n numero binario de " + numeroDecimal + " es = "  + Integer.toBinaryString(numeroDecimal); //convierte al decimal en un tipo String pero pasandolo a binario.


        String mensajeOctal = " \n numero octal de " + numeroDecimal + " es = " +Integer.toOctalString(numeroDecimal);


        String mensajeHexa =  " \n numero hexadecimal de " + numeroDecimal + " es = " + Integer.toHexString(numeroDecimal) ;



        String mensaje = mensajeBinario + mensajeOctal + mensajeHexa;
        System.out.println(mensaje);
    }
}
