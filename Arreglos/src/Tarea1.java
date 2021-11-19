import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un número");
            numeros[i] = sc.nextInt();
        }

        int j = numeros.length-1;
        for (int i = 0; i < numeros.length /2; i++) {

            System.out.println(numeros[i] + " " + numeros[j--]);
        }
    }
/*Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos. Luego debemos mostrarlos en el siguiente orden:
el último, el primero, el penúltimo, el segundo, el antepenúltimo, el tercero, y así sucesivamente.

 */
}
