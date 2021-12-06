import java.util.Locale;

public class ejemploStringValidar {
    public static void main(String[] args) {
        
        String curso = null;
        
        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo); //da true poirque es nulo curso;

        if(esNulo )
        {
            curso = "Programación Java";

        }
        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty(); //otra formañ

        if(esVacio2){
            System.out.println("esVacio2 = " + esVacio2);
        }
        if(!esVacio){
            System.out.println("Bienvenido al curso " + curso); //el + no rompe la app y el concat si porque no acepta nulos.

        }
        boolean isBlank = curso.isBlank();
        if (!isBlank){
            System.out.println("isBlank = " + isBlank);
        }


    }
}
