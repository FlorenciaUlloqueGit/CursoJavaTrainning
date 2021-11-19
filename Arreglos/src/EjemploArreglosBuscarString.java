import java.util.Locale;
import java.util.Scanner;

public class EjemploArreglosBuscarString {
    public static void main(String[] args) {
        String [] a = new String[10];

        Scanner s  = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println("ingrese un nombre");
            a[i] = s.next();
        }

        System.out.println("\r\n Ingrese un nombre a buscar: ");
        String palabra = s.next();
        int i = 0;
       for (; i< a.length && !a[i].equalsIgnoreCase(palabra);i++ ){ }
        if(i == a.length){
            System.out.println("palabra no encontrado");
        } else if(a[i].toLowerCase().compareTo(palabra.toLowerCase(Locale.ROOT)) == 0){
            System.out.println("palabra encontrada: en la posición "+ i);
        }

    }
}
