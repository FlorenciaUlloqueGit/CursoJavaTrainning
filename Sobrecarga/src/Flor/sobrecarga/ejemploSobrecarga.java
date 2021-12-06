package Flor.sobrecarga;
import static Flor.sobrecarga.Calculadora.*;

public class ejemploSobrecarga {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        System.out.println("sumar enteros: " +sumar(5,4));

        System.out.println("sumar cuatro enteros: " +sumar(10.5f,9,6,7,8)); //en casos de public static  se usa el objeto y no la instancia

        System.out.println("sumar float -entero: " + sumar(10.4f, 3));

        System.out.println("sumar floats: " + sumar(2.0f, 4.3f));
        System.out.println("sumar floats: " + sumar(2.0f, 4.3f));

        System.out.println("sumar int-float: "+sumar(4, 4.5f));
        System.out.println("sumar double:" +sumar(10.0 , 4.0));
        System.out.println("sumar muchos double:" + Calculadora.sumar(10.0, 5.6, 4.4, 5.5,2.2 , 4.0));
     //   System.out.println("sumar Strings: " + sumar("10", "5"));

        System.out.println("sumar 3 enteros"  + sumar(10,5,6));

        System.out.println("sumar dos long no declarados:" + sumar(10l, 5l));
        System.out.println("sumar int: " + sumar(50, '@'));
        System.out.println("sumar float-int: " + sumar(10f, '@'));
    }
}
