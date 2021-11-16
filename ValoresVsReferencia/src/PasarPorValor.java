public class PasarPorValor {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Iniciamos el main con i=  " + i);

        test(i);

        System.out.println("Finaliza el método mail con el valor de i = " + i); //se mantiene i = 10;   no cambia porque las clases son inmutables y retorna una nueva instancia.
    }
    public static  void test(int  i){ //el main puede invocar este método
        System.out.println("Iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("Finaliza el método test con i = " + i);
    }
}
