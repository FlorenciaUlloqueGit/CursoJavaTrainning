import java.util.Scanner;

public class EjemploArreglosBuscarEnteros {
    public static void main(String[] args) {
        int [] a = new int[10];

        Scanner s  = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println("ingrese un número");
            a[i] = s.nextInt();
        }

        System.out.println("\r\n Ingrese un número a buscar: ");
        int num = s.nextInt();
        int i = 0;
       for (; i< a.length && a[i] != num; i++ ){ }
        if(i == a.length){
            System.out.println("número no encontrado");
        } else if( num == a[i]){
            System.out.println("Número encontrado: El número fue encontrado en la posición "+ i);
        }

    }
}
