import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {

        int[] a, pares, impares;

        a = new int[10];
        int contPar = 0;
        int contImpar = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese 10 numeros enteros");
        for (int i = 0; i < a.length ; i++) {
            a[i] = scanner.nextInt();
            if(a[i] %2 == 0){
               contPar++;
            }else {
                contImpar++;
            }
        }

        pares = new int [contPar];
        impares = new int[contImpar];

        int j = 0;
        int k = 0;

        for (int i = 0; i< a.length; i++){
            if(a[i] % 2 == 0){
                pares[j++] = a[i];
            }else {
                impares[k++]= a[i];
            }
        }
        System.out.println("Pares");
        for (int i = 0; i <pares.length ; i++) {
            System.out.print(" " + pares[i]);
        }
        System.out.println("\r\nImpares"); //para dar salto de linea
        for (int i = 0; i <impares.length ; i++) {
            System.out.print(" " + impares[i]);
        }
        System.out.println();
    }
}
