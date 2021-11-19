import java.util.Arrays;

public class EjemploArreglosForInversa {
    public static void main(String[] args) {

       // String[] productos = new String[7];
        String[] productos = {"Kingstom Pendrive","samsung galaxy","Alienware" ,"lenovo ideapad","wireless","alfaromeo","toyota" };
        int tam = productos.length;


       /* productos[0] = "kigstom ";
        productos[1] = "samsung galaxy";
        productos[2] = "Alienware";
        productos[3] = "lenovo ideapad";
        productos[4] = "wireless";
        productos[5] = "alfaromeo";
        productos[6] = "toyota";


        */
       Arrays.sort(productos); //el metodo sort ordena los productos de la a a la z.

        System.out.println("_____usando for_________");
        for (int i = 0; i < tam; i++) {
            System.out.println("para indice "+ (tam-1-i ) + " : " + productos[i]);

        }
        System.out.println("_____usando for inverso _________");
        for (int i = 0; i < tam; i++) {
            System.out.println("Para i = " + i + " Valor: " + productos[tam-1-i]); //para ir de adelante hacia atras en los obj del arreglo.

        }
        System.out.println("_____usando for inverso 2_________");

        for (int i = tam-1; i >= 0; i--) {
            System.out.println("para i = " + i + " valor " + productos[i]);

        }
    }
}
