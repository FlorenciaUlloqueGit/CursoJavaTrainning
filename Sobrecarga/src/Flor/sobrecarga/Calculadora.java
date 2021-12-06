package Flor.sobrecarga;


import com.sun.jdi.InvalidLineNumberException;

public class Calculadora {
    public int sumar (int a, int b){
        return a + b;
    }
public static int sumar(int...argumentos){ //con el tipo ... n cantidad de parametros enteros
        int total = 0;
    for (int i : argumentos     ) {
        total += i;
    }
    return total;
}
    public static float sumar (float a, int...argumentos){ //con el tipo ... n cantidad de parametros enteros
        float total = a; //suma rel float a a la lista de enteros y retorna un float.
        for (int i : argumentos     ) {
            total += i;
        }
        return total;
    }
//los metodos con args se trabajan como si fueran un arreglo y se declaran con el encabezado con el tipo de metodo y ...
    public static double sumar (double...argumentos){ //con el tipo ... n cantidad de parametros enteros
        double total = 0.0; //suma rel float a a la lista de enteros y retorna un float.
        for (double i : argumentos     ) {
            total += i;
        }
        return total;
    }



    public float sumar(float x, float y){
        return x + y;
    }

    public float sumar (int i, float j){
        return  i+ j;
    }
    public float sumar (float i, int j){
        return i+j;
    }
    public double sumar (double i, double j){
        return i + j;
    }

    public int sumar (String a , String b){
        int resultado;
        try{
            resultado =   Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e){
            resultado = 0;
        }
        return resultado;

    }

    public int sumar(int a, int b, int c){
        return a+b+c;
    }

    //sobrecarga, distintos metodos quye suman, mismo com´portameniento pero implementados de forma diferente


}
