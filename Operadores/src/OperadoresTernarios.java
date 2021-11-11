import java.util.Scanner;

public class OperadoresTernarios {
    public static void main(String[] args) {
        // es como una version abreviada del if/else

      //  variable = condicion ? si es verdadero : si es falso:
        

        String variable = 7==7 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);// imprime si es verdadero

        String estado = "";
        double matematicas = 0;
        double ciencias = 0;
        double historia = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nota de mate");
         matematicas = scanner.nextFloat();
        System.out.println("ingrese la nota de ciencas");
        ciencias = scanner.nextDouble();
        System.out.println("Ingrese la nota de historia");
        historia = scanner.nextDouble();


        double promedio = (matematicas + historia + ciencias ) /3;
        System.out.println("promedio = " + promedio);
        estado = promedio >= 6?"aprobado": "rechazado";
        System.out.println("estado = " + estado);
    }
}
