import javax.swing.*;

public class OperadoresAritméticos {
    public static void main(String[] args) {
        int i = 5,  j = 4;
        int suma = i+j;

        System.out.println("suma = " + suma);

        System.out.println("(i + j) = " + (i + j));
        int resta = i-j;
        System.out.println("resta = " + resta);

        int multiplicación = i*j;
        System.out.println("multiplicación = " + multiplicación);
        float div =(float) i/j;
        System.out.println("div =  " + div);
        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número")); //toma el número ingresado por el input

        if(numero % 2 == 0){
            System.out.println("numero par = " +numero);
        }else{
            System.out.println("es impar");
        }



    }
}
