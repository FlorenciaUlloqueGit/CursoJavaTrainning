import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int tam = productos.length;


        productos[0] = "kigstom ";
        productos[1] = "samsung galaxy";
        productos[2] = "Alienware";
        productos[3] = "lenovo ideapad";
        productos[4] = "wireless";
        productos[5] = "alfaromeo";
        productos[6] = "toyota";

       Arrays.sort(productos); //el metodo sort ordena los productos de la a a la z.

        System.out.println("_____usando for_________");
        for (int i = 0; i < tam; i++) {
            System.out.println("para indice "+ i + " : " + productos[i]);

        }
        System.out.println("_____usando foreach_________");
        for (String prod: productos) {
            System.out.println("prod = " + prod);

        }

        System.out.println("_____usando while________");
        int i = 0;
        while ( i < tam){
            System.out.println("Para indice = " + i + " : " + productos[i]);
            i++;

        }
        System.out.println("_____usando do while________");
        int j = 0;
       do{
            System.out.println("Para indice = " + j + " : " + productos[j]);
            i++;

        } while( i < tam);

        int [] numeros = new int[10];
        int tam2 = numeros.length;

        for (int k = 0; k <tam2 ; k++) {
            numeros[k] = k*3; //lena erl arrelgo de forma diámica y el otro muestra los datos
        }
        for (int k = 0; k <tam2 ; k++) {
            System.out.println("numeros = " + numeros[k]);
        }



    }
}
