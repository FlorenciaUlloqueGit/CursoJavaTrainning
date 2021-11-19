import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[7];
        int tam = nums.length;

        for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese un número ");
            nums[i] = sc.nextInt();

        }

        int contPositivos = 0;
        int contadorNegativo = 0;
        int contCeros = 0;
        for (int i = 0; i < tam; i++) {
            if(nums[i] == 0) {
                contCeros++;
            } else if( nums[i] > 0){

                contPositivos++;
            }else{

                contadorNegativo++;
            }
        }
        int contadorTotal = contadorNegativo+ contPositivos + contCeros;
        double promedioPositivos = ((double) contPositivos/ contadorTotal) * 100;
        double promNegativos = ((double)contadorNegativo  /contadorTotal) *100;

        System.out.println("El promedio de números positivos es igual a  = " + promedioPositivos + "\n El promedio de números negativos es igual a = " + promNegativos
        + " y la cantidad de 0 es igual a = " + contCeros);
    }
}
/*
Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio de los números positivos,
el promedio de los negativos y contar el número de ceros.
 */
