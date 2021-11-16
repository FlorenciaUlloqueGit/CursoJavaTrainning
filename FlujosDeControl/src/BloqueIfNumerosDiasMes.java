import java.util.Scanner;

public class BloqueIfNumerosDiasMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el núemro del mes ");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el año ");
        int año =scanner.nextInt();


     int numDias = 0;


     if(mes == 1 || mes == 3 || mes == 5 || mes==7 || mes==8 || mes==10||mes==12){
    numDias = 31;
     }
     else if(mes==4 || mes== 6 || mes == 9 || mes == 11){
         numDias = 30;
     }else if (mes ==2){
         if(año % 400 == 0 || (año %4 == 0) && !(año %100 ==0 )){
             numDias = 29;
         } else{
             numDias = 28;
         }
     }
        System.out.println("numero de dias del mes en el año " + año + " es igual a " + numDias );
    }
}
