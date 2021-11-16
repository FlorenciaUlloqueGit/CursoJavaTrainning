import java.util.Scanner;

public class TareaMultiplicarSinMultiplicar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
       int num = scan.nextInt();
        System.out.println("Ingrese otro número");
       int num2 = scan.nextInt();
       int numFinal = 0;

       int AcumNum = 0;


       if ( num2 < 0 && num > 0) { // para num negativo (2do positivo 1ero Negativo)
           for (  int i = 0;i > num2; i--) {
                   AcumNum += num;
                   numFinal = -(AcumNum);

           }
       }
       if(num < 0  && num2 >= 0){  // para num negativo // para num negativo (2do negativo y primero positivo)
           for (int i = 0; i < num2; i++) {
               AcumNum += num;
               numFinal = (AcumNum);
           }
       }
       if(num < 0 && num2 < 0) //positivos
       {
           for (int i = 0; i > num2; i--) {
               AcumNum += num;
               numFinal = -(AcumNum);
           }
       }

       if (num> 0 && num2> 0){ //ambos numeros negativos
           for (int i = 0; i < num2; i++) {
               AcumNum += num;
               numFinal = AcumNum;
           }
        }

        System.out.println("El número " + num + " multiplicado por el número " + num2 + " da como resultado = " + numFinal);



    }
}
/*
Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin usar el símbolo de multiplicación (*).

Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios, donde menos por menos es positivo.
 */