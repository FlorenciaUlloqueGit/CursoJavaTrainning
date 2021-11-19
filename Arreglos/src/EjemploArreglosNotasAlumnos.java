import java.util.Scanner;

public class EjemploArreglosNotasAlumnos {
    public static void main(String[] args) {
        double[] claseMatematica, claseHistoria, claseLengua;
        claseMatematica = new double[7];
        claseHistoria = new double[7];
        claseLengua = new double[7];

       double sumaMAte = 0 , sumaHistoria= 0, sumaLengua = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("ingrese 7 notas para mate");
        for (int i = 0; i < claseMatematica.length; i++) {
            claseMatematica[i] = s.nextDouble();

        }
        System.out.println("ingrese 7 notas para lengua");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = s.nextDouble();

        }
        System.out.println("ingrese 7 notas para lengua");
        for (int i = 0; i < claseLengua.length; i++) {
            claseLengua[i] = s.nextDouble();

        }

        for (int i = 0; i < 7; i++) {
             sumaMAte += claseMatematica[i];
             sumaHistoria += claseHistoria[i];
             sumaLengua += claseLengua[i];
        }

        double promedioMate =  (sumaMAte / claseMatematica.length);
        double promHistoria = (sumaHistoria / claseMatematica.length);
        double promLengua =  (sumaLengua / claseMatematica.length);
        System.out.println(" Promedio de matematica = " + promedioMate);
        System.out.println(" Promedio de historia = " + promHistoria );
        System.out.println(" Promedio de lengua = " + promLengua) ;
        
        double promedioTotal = (promedioMate + promHistoria + promLengua )/3;
        System.out.println("promedioTotal = " + promedioTotal);

        System.out.println("ingrese el identificador del alumno : del 0 al 6");
        int identif = s.nextInt();
        double promedioAlumno = (claseHistoria[identif] + claseLengua[identif] + claseMatematica[identif]) /3;
        System.out.println("promedioAlumno = " + promedioAlumno);

        
    }

    
}
