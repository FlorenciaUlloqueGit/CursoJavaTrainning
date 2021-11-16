import java.util.Locale;
import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero
        // convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona.
        // Por ejemplo para Andres debe quedar como N.es

        String nombre1;
        String nombre2;
        String nombre3;

        System.out.println("Ingrese el nombre de un integrante de su familia");
        nombre1 = scan.nextLine();
        System.out.println("Ingrese el nombre de un integrante de su familia");
        nombre2 = scan.nextLine();
        System.out.println("Ingrese el nombre de un integrante de su familia");
        nombre3 = scan.nextLine();

    char segundaLetra1= nombre1.toUpperCase().charAt(1);
    char segundaLetra2= nombre2.toUpperCase().charAt(1);
    char segundaLetra3= nombre3.toUpperCase().charAt(1);

    String nombre1Formateado = segundaLetra1 + ".".concat(nombre1.substring(nombre1.length()-2));
    String nombre2Formateado = segundaLetra2 + ".".concat(nombre2.substring(nombre2.length()-2));
    String nombre3Formateado = segundaLetra3 + ".".concat(nombre3.substring(nombre3.length()-2));


        System.out.println(nombre1Formateado.concat(nombre2Formateado).concat(nombre3Formateado));
    }

}
