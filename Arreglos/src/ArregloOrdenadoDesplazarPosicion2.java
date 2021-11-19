import java.util.Scanner;

public class ArregloOrdenadoDesplazarPosicion2 {
        public static void main(String[] args) {

            int[] numeros = new int[7];
            Scanner s = new Scanner(System.in);

            int ultimo;

            for (int i = 0; i <numeros.length ; i++) {
                System.out.println("ingrese el número ");
                numeros[i] =  s.nextInt();
            }


            System.out.println("Ingrese el número a agregar");
            int num = s.nextInt();
           // System.out.println("Ingrese la posición donde va a agregar el número");
          //  int pos = s.nextInt();

            int aux = 0;
            int i = 0;
            ultimo = numeros[numeros.length -1];
            while(i < 7 && numeros[i] < num){
                i++;
            }
            aux = i;



            for (int j = numeros.length-2; j >= aux ; j--) {
                numeros[j +1] = numeros[j];
            }

            int [] b = new  int[numeros.length +1];
            System.arraycopy(numeros, 0, b, 0, numeros.length);
            if(num > ultimo){
                b[b.length -1] = num;
                b[aux] = num;
            }else{
                b[b.length -1] = ultimo;
                b[aux] = num;
            }
            numeros[aux] = num; // no entiendo porque no lo sobrescribe

            System.out.println("el arreglo: ");
            for (int k = 0; k <numeros.length ; k++) {
                System.out.println(numeros[k]);
            }
        }
    }


