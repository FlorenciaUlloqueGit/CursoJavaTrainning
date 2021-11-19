import java.util.Scanner;

public class EjemploArreglosAgregarYDesplazarPosiciones {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner s = new Scanner(System.in);


        for (int i = 0; i <9 ; i++) {
            System.out.println("ingrese el número ");
           numeros[i] =  s.nextInt();
        }


        System.out.println("Ingrese el número a agregar");
        int num = s.nextInt();
        System.out.println("Ingrese la posición donde va a agregar el número");
        int pos = s.nextInt();




        for (int i = numeros.length-2; i >= pos ; i--) {
            numeros[i +1] = numeros[i];
        }
        numeros[pos] = num; // no entiendo porque no lo sobrescribe

        System.out.println("el arreglo: ");
        for (int i = 0; i <numeros.length ; i++) {
            System.out.println(numeros[i]);
        }
    }
}
