import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el tamaño de filas o columnas de la matriz cuadrada debe ser mayor a 4");
        int num = scanner.nextInt();
        if(num == 0){
            System.out.println("Debe ingresar un número mayor a 0");
            num = scanner.nextInt();
        }

        int [][] matriz = new int[num][num];
       double  mitadNum = num/2;
       double  mitadSilla = Math.ceil(mitadNum);

        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                if(i == i && j == 0){
                    matriz[i][j] = 1;
                }
                if(i == mitadSilla ){
                    matriz[i][j] = 1;
                }
                if( i> mitadSilla && j == matriz[i].length-1 )
                {
                    matriz[i][j] = 1;

                }

                
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
/*
Escribir un programa para una matriz de n x n e imprima en ella una silla (o letra h minúscula) construida a base del numero 1 y utilizar el numero 0 como espacio. El tamaño de la silla se basa en una variable n que indicará el tamaño de la figura a imprimir en una matriz de n x n.

Por ejemplo para n=5 se obtiene:

10000
10000
11111
10001
10001
Por ejemplo para n=6 se obtiene:

100000
100000
100000
111111
100001
100001
Por ejemplo para n=10 se obtiene:

1000000000
1000000000
1000000000
1000000000
1000000000
1111111111
1000000001
1000000001
1000000001
1000000001
Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.
 */