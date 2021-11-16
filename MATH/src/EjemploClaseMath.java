import com.sun.tools.javac.Main;

public class EjemploClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5, 1.2);  //retorna el valor max entre dos numeros.
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2); //retorna el valor min entre dos números
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5); //redondeo hacia arriba.
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.5); //redondea hacia abajo
        System.out.println("piso = " + piso);

        long entero = Math.round(3.4); //redondea para arriba o abajo dependiendo el número. (3.4 abajo y 3.5 arriba)
        System.out.println("entero = " + entero); //devuelve un entero

        double exp = Math.exp(2); //exponencial. seria e elevada a el num en párentesis. En paréntesis sale el npumero a elevar
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log); //logaritmo natural de 10

        double potencia = Math.pow(10, 3); // potencia: primer número elevado por el segundo
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5); //raiz cuadrada. en este caso es raiz cuadrada de 5.
        System.out.println("raiz = " + raiz);

        //Métodos para trigonometria:

        //para convertir en radianes a grados.
        double grados = Math.toDegrees(1.57); //ingreso en el parentesis los radianes y me dice cuantos grados corresponden
       grados = Math.round(grados);
        System.out.println("Convertir radianes a grados = " + grados);

        double radianes = Math.toRadians(90.00);
        System.out.println("Convertir de grados a radianes = " + radianes);

        System.out.println("seno de 90: " + Math.sin(radianes)); //seno de 90
        System.out.println("coseno(90): " + Math.cos(radianes)); //coseno de 90°

        radianes = Math.toRadians(180.00);
        System.out.println("cos(90) = " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("cos(90) = " + Math.cos(radianes));






    }
}
