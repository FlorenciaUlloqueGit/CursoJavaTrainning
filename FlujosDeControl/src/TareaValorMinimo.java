import java.util.Scanner;

public class TareaValorMinimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] num = new int[10];
        int count = num.length;
        int menor = 0 ;
        for (int i = 0; i < count; i++) {
            System.out.println("Ingrese un número");
            num[i] = scanner.nextInt();
            if(i== 0){
                menor = num[0];
              //  continue;
            }
            if(num[i] < menor){
                menor = num[i];
            }


        }
        System.out.println("El mínimo número entre todos los ingresados es igual a " + menor);

    }
}
