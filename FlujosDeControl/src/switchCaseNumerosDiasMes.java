import java.util.Scanner;

public class switchCaseNumerosDiasMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el núemro del mes ");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el año ");
        int año =scanner.nextInt();


     int numDias = 0;

     switch (mes){
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:
             numDias = 31; break;
         case 4:
         case 6:
         case 9:
         case 11:
             numDias = 30;
             break;
         case 2:
             if(año % 400 == 0 || (año %4 == 0) && !(año %100 ==0 )){
                 numDias = 29;
             }
             break;
             default:
                     numDias = 0;
                     break;
     }
        System.out.println("numero de dias del mes en el año " + año + " es igual a " + numDias );
    }
}
