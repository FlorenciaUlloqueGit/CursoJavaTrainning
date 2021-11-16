public class PasarPorReferencia {
    public static void main(String[] args) {
        int edad[] = {10, 11,12};
        System.out.println("Iniciamos el main ");
        for (int i = 0; i <edad.length ; i++) {
            System.out.println("edad[i] = " +edad[i]);
        }
        System.out.println("antes de invocar al método test");
        test(edad);

        System.out.println("después de invocar al método test");

        for (int i = 0; i <edad.length ; i++) {
            System.out.println("edad[i] = " +edad[i]);
        }
        System.out.println("Finaliza el método main con los datos del arreglo");
    }
    public static  void test(int [] edadArreglo){ //el main puede invocar este método
        System.out.println("Iniciamos el método test" );
        for (int i = 0; i < edadArreglo.length; i++) {
            edadArreglo[i] = edadArreglo[i] + 20;

        }

        System.out.println("Finaliza el método test");
    }
}
