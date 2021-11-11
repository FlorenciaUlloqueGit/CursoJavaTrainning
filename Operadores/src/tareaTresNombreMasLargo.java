import java.util.Scanner;

public class tareaTresNombreMasLargo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] nombre = new  String[3];
        String [] apellido = new String[3];

        System.out.println("Ingrese el nombre de la primer persona");
        nombre[0] = scan.nextLine();
        System.out.println("Ingrese el apellido de la primer persona");
        apellido[0] = scan.nextLine();
        System.out.println("Ingrese el nombre de la segunda persona");
        nombre[1] = scan.nextLine();
        System.out.println("Ingrese el apellido de la segunda persona");
        apellido[1] = scan.nextLine();
        System.out.println("Ingrese el nombre de la tercer persona");
        nombre[2] = scan.nextLine();
        System.out.println("Ingrese el apellido de la tercer persona");
        apellido[2] = scan.nextLine();

        String Persona1 = nombre[0].concat(" ").concat(apellido[0]);
        String Persona2 = nombre[1].concat(" ").concat(apellido[1]);
        String Persona3 = nombre[2].concat(" ").concat(apellido[2]);

        String mensaje = "" ;

        String Persona = (Persona1.length() > Persona2.length())? Persona1: Persona2;
        Persona = (Persona.length() > Persona3.length()) ? Persona : Persona3;


        mensaje= "La persona con el nombre y apellido más largo es " + Persona;
        System.out.println(mensaje);



    }
}
/*
Obtener el nombre mas largo de tres personas, según los siguientes requerimientos
Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando la clase JOptionPane y método showInputDialog().

Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)   (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)

Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el indice cero accedemos al nombre de la persona.

Restricción no usar loops en el desarrollo de la tarea.

Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
 */