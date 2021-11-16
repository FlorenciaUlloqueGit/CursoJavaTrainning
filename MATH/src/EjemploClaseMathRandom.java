import java.util.Random;
public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String [] colores = {"azul", "verde", "amarillo", "verde", "gris", "blanco"};
        double random = Math.random(); // devuelve un número aleatorio entre 0 y 1 pero nunca llega al 1
        System.out.println("random = " + random);
        random *= colores.length; // para obtener un numero entre 0 y 6 pero no incluye el 7
        System.out.println("random = " + random);

        random = Math.floor(random); //redondeamos hacia abajo para ioncluir al numero 6
        System.out.println("random = " + random);

        System.out.println("colores[(int) random] = " + colores[(int) random]);


        Random randomObjeto = new Random(); //aleatorios con la clase random
        int randomInt = 15 + randomObjeto.nextInt(25-15+1); //enteros positivos y negativos del tipo int entre 15 y 25
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObjeto.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
        


    }

}
