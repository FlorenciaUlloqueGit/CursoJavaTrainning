import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[7];
        int tam = nums.length;
   
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese un número entre 11 a 99");
            nums[i] = sc.nextInt();
            while(nums[i] >99 || nums[i] < 11){
                System.out.println("el número que ingresó está fuera de rango: Reingrese el número");
                nums[i] = sc.nextInt();
            }
        }
        int numGrande = 0;
        for (int i = 0; i < tam; i++) {
            if( numGrande < nums[i]){
                numGrande = nums[i];
            }
        }

        System.out.println("numGrande = " + numGrande);
    }
}
/*
Escriba un programa que imprima el número más alto de un arreglo de 7 elementos
(de rango 11 a 99), por ejemplo {14, 33, 15, 36, 78, 21, 43},
si se repite un valor considerar uno solo.
 */