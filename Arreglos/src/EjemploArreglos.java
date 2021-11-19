import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7];

        productos[0] = "kigstom ";
        productos[1] = "samsung galaxy";
        productos[2] = "Alienware";
        productos[3] = "lenovo ideapad";
        productos[4] = "wireless";
        productos[5] = "alfaromeo";
        productos[6] = "toyota";

        Arrays.sort(productos); //el metodo sort ordena los productos de la a a la z.


        String prod1 =  productos[0];
        String prod2 =  productos[1];
        String prod3 =  productos[2];
        String prod4 =  productos[3];
        String prod5 =  productos[4];
        String prod6 =  productos[5];
        String prod7 =  productos[6];


        System.out.println("productos[0] = " +prod1);
        System.out.println("productos[1] = " + prod2);
        System.out.println("productos[2] = " +prod3);
        System.out.println("productos[3] = " +prod4);
        System.out.println("productos[4] = " +prod5);
        System.out.println("productos[5] = " + prod6);
        System.out.println("productos[6] = " + prod7);


        int [] numeros = new int[4];

        numeros[0] = 10;
        numeros[1] = -2;
        numeros[2] = 32;
        numeros[3] = 43;

        Arrays.sort(numeros);
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length -1]; //para acceder al último elemento del arreglo.

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }
}
