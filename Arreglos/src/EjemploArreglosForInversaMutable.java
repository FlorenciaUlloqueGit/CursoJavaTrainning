import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArreglosForInversaMutable {
public static  void arregloInverso(String[] productos){
    int tam = productos.length;
    int total2 = productos.length;
    for (int i = 0; i < total2; i++) {
        String actual = productos[i];
        String inverso = productos[tam-1-i];
        productos[i] = inverso;
        productos[tam-i-1] = actual;
        total2 --;
    }
}

    public static void main(String[] args) {


        String[] productos = {"Kingstom Pendrive","samsung galaxy","Alienware" ,"lenovo ideapad","wireless","alfaromeo","toyota" };




       Arrays.sort(productos);



        arregloInverso(productos);
        // Collections.reverse(Arrays.asList(productos)); //hace reversa el arreglo


        System.out.println("_arregloconMetodo");
        int tam = productos.length;
        System.out.println("_____usando for_________");
        for (int i = 0; i < tam; i++) {
            System.out.println("para indice "+ (tam-1-i ) + " : " + productos[i]);
        }
    }
}
