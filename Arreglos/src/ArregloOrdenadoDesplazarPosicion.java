import java.util.Scanner;

public class ArregloOrdenadoDesplazarPosicion {
        public static void main(String[] args) {

            int[] numeros = new int[7];
            Scanner s = new Scanner(System.in);


            for (int i = 0; i <numeros.length-1 ; i++) {
                System.out.println("ingrese el número ");
                numeros[i] =  s.nextInt();
            }


            System.out.println("Ingrese el número a agregar");
            int num = s.nextInt();
           // System.out.println("Ingrese la posición donde va a agregar el número");
          //  int pos = s.nextInt();

            int aux = 0;
            int i = 0;
            while(numeros[i] < num){
                i++;
            }
            aux = i;



            for (int j = numeros.length-2; j >= aux ; j--) {
                numeros[j +1] = numeros[j];
            }
            numeros[aux] = num; // no entiendo porque no lo sobrescribe

            System.out.println("el arreglo: ");
            for (int k = 0; k <numeros.length ; k++) {
                System.out.println(numeros[k]);
            }
        }
    }


