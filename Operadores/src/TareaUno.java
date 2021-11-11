import java.util.Scanner;

public class TareaUno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número");
        double n1 = scanner.nextDouble();
        System.out.println("Ingrese otro número");
        double n2 = scanner.nextDouble();
        System.out.println("Ingrese otro número");
        
        double n3 = scanner.nextDouble();
        
        double numMayor ; 
        numMayor = n1 > n2? n1 : n2;
        numMayor = numMayor > n3 ? numMayor: n3;

        System.out.println("numMayor = " + numMayor);
    }
}
