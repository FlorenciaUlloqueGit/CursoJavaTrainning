import java.util.Scanner;

public class Tarea2NotasAlumnos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       double notaMayor5= 0;
       int contadorMayor5 = 0;

        double notaMenor4= 0;
        int contadorMenor4 = 0;
        int contUnos= 0;

        double acumTotal = 0;
        int contTotal = 0;

       For: for (int i = 0; i < 5; i++) {
            System.out.println("ingrese una nota final");
            double nota = sc.nextDouble();

           if(nota == 0){
               System.out.println("Decidió terminar con el ingreso de datos");
               break;
           }
            while(nota < 1  || nota >7){
                System.out.println("error! las notas ingresadas sólo pueden ir del 1 al 7");
                System.out.println("Reingrese la nota mal ingresada");
                i--;
                continue For ;

            }
            if (nota > 5){
               notaMayor5 = notaMayor5 +nota ;
                contadorMayor5 ++;
            }
            if(nota < 4){
                notaMenor4 =notaMenor4 + nota;
                contadorMenor4++;
            }
            if(nota == 1){
                contUnos++;
            }


            contTotal ++;
            acumTotal += nota;
        }

        System.out.println("El total de notas ingresadas es igual a " + contTotal);
        System.out.println("El promedio de notas mayores a 5 es igual a  " + (notaMayor5/contadorMayor5));
        System.out.println("El promedio de notas menores a 4 es igual a  " + (notaMenor4/contadorMenor4));
        System.out.println("La cantidad de notas igual a 1 es igual a " + contUnos);
        System.out.println("El promedio total de todas las notas es igual a " + (acumTotal/contTotal));
        System.out.println("contadorMayor5 = " + contadorMayor5);
        System.out.println("contadorMenor4 = " + contadorMenor4);


    }

}
/*
Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double). Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.

Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).

Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
 */