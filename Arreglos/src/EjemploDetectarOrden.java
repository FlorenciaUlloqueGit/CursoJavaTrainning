import java.util.Scanner;

public class EjemploDetectarOrden {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[7];
        System.out.println("Ingrese 7 números");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        boolean ascendente = false;
        boolean desc = false;
        for (int i = 0; i <a.length -1; i++) {
            if(a[i] > a[i+1]){
                desc = true;

            }
            if(a[i] < a[i+1]){
                ascendente = true;
            }

        }
        if (desc == true && ascendente == true){
            System.out.println("Arreglo =  desordenado");
        }
        if (desc == false && ascendente == false){
            System.out.println("Arreglo =  Son todos iguales");
        }
        if (desc == false && ascendente == true){
            System.out.println("Arreglo = ascendente");
        }
        if (desc == true && ascendente == false){
            System.out.println("Arreglo = descendente");
        }


    }

}
