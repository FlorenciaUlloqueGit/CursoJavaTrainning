import java.util.Scanner;

public class CalcularAreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo para calcular el área");
        double radio = scanner.nextDouble();
        
        radio = Math.pow(radio, 2);
        System.out.println("radio = " + radio);
        double area = Math.PI * radio ;
        System.out.println(" El area del círculo es de  = " + area);
    }
    
}
