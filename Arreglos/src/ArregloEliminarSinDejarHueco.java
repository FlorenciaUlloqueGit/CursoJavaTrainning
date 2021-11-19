import java.util.Scanner;

public class ArregloEliminarSinDejarHueco {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner s = new Scanner(System.in);


        for (int i = 0; i <numeros.length ; i++) {
            System.out.println("ingrese el número ");
            numeros[i] =  s.nextInt();
        }


        System.out.println("Ingrese el número a Eliminar");
        int num = s.nextInt();
        int a = 0;
        while(numeros[a] != num){
            a++;
        }



        for (int j = a; j < numeros.length -1; j++) {
            numeros[j] = numeros[j+1];
        }


        int arregloComeArreglo[] = new int[9];
        for (int i = 0; i <arregloComeArreglo.length ; i++) {
            arregloComeArreglo[i] = numeros[i];
        }

        int []arregloDeArreglo= new int [numeros.length-1];
        System.arraycopy(numeros , 0, arregloDeArreglo, 0, arregloDeArreglo.length );
        for (int i = 0; i < arregloDeArreglo.length; i++) {
            System.out.println("arregloDeArreglo = " + arregloDeArreglo[i]);
        }
    }
}
