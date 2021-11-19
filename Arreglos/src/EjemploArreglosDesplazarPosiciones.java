import java.util.Scanner;

public class EjemploArreglosDesplazarPosiciones {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner s = new Scanner(System.in);

        int ultimo = 0;
        for (int i = 0; i <10 ; i++) {
            System.out.println("ingrese el número ");
           numeros[i] =  s.nextInt();
        }

        ultimo = numeros[numeros.length-1];
        //int aux = 0;
        for (int i = numeros.length-2; i >= 0 ; i--) {

            numeros[i +1] = numeros[i];
        }
        numeros[0] = ultimo;
        System.out.println("el arreglo: ");
        for (int i = 0; i <numeros.length ; i++) {
            System.out.println(numeros[i]);
        }
    }
}
