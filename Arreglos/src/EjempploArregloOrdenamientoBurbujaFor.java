import java.util.Arrays;

public class EjempploArregloOrdenamientoBurbujaFor {
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
public static void arregloSortBurbuja(Object[] arreglo) {
int tam = arreglo.length;
int cont = 0;

    for (int i = 0; i < tam - 1; i++) {

        for (int j = 0; j < tam - 1 - i; j++) { //va del mayor al menor
            if (((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) > 0) { //compare to da un int negativo si el objeto es anterior al parametro y positivo si el objeto es posterior al parametro.
                int aux = (int) arreglo[j]; // = si la pos j+1 va antes que j , j es igual a j+a y j+1 es igual a j
                arreglo[j] = arreglo[j + 1];
                arreglo[j+1] = aux;
            }
            cont++;
        }

    }
    System.out.println("cont = " + cont);

}

    public static void main(String[] args) {


        String[] productos = {"kingstom Pendrive", "samsung galaxy", "alienware", "lenovo ideapad", "wireless", "alfaromeo", "toyota"};
        int tam = productos.length;
        int cont = 0;

       for (int i = 0; i < tam - 1; i++) {

            for (int j = 0; j < tam - 1 - i; j++) {  //va del menor al mayor observar el <0
                if (productos[j + 1].compareTo(productos[j]) < 0) { //compare to da un int negativo si el objeto es anterior al parametro y positivo si el objeto es posterior al parametro.
                    String aux = productos[j]; // = si la pos j+1 va antes que j , j es igual a j+a y j+1 es igual a j
                    productos[j] = productos[j + 1];
                    productos[j + 1] = aux;
                }
                 cont++;
            }
        }



     //   arregloSortBurbuja(productos);

        int tam2 = productos.length;
        System.out.println("_____usando for_________");
        for (int i = 0; i < tam2; i++) {
            System.out.println("para indice " + (tam2 - 1 - i) + " : " + productos[i]);
        }



        Integer[] numeros = new Integer[4];

        numeros[0] = 10;
        numeros[1] = -2;
        numeros[2] = 32;
        numeros[3] = 43;
        int tam3 = numeros.length;

        arregloSortBurbuja(numeros);

        for (int i = 0; i < tam3 ; i++) {
            System.out.println("numeros = " + numeros[i]);

        }
    }
}
