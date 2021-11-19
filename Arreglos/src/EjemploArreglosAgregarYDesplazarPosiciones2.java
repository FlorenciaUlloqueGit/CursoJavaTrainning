import java.util.Scanner;

public class EjemploArreglosAgregarYDesplazarPosiciones2 {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int ultimo;
        Scanner s = new Scanner(System.in);


        for (int i = 0; i <numeros.length ; i++) {
            System.out.println("ingrese el número ");
           numeros[i] =  s.nextInt();
        }


        System.out.println("Ingrese el número a agregar");
        int num = s.nextInt();
        System.out.println("Ingrese la posición donde va a agregar el número");
        int pos = s.nextInt();


        ultimo = numeros[numeros.length -1];


        for (int i = numeros.length-2; i >= pos ; i--) {
            numeros[i +1] = numeros[i];
        }
        int[] nuevoArreglo = new int[numeros.length + 1];
        System.arraycopy(numeros,0, nuevoArreglo, 0 , numeros.length );
        nuevoArreglo[pos] = num;
        nuevoArreglo[nuevoArreglo.length -1 ] = ultimo;



        System.out.println("el arreglo: ");
        for (int i = 0; i <nuevoArreglo.length ; i++) {
            System.out.println(nuevoArreglo[i]);
        }
    }
}
