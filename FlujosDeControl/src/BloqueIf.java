public class BloqueIf {
    public static void main(String[] args) {

        float promedio = 4.9f;
       if (promedio >= 6.5) {
           System.out.println("Felicitaciones, excelente promedio");

       } else if(promedio >= 6 ) {
           System.out.println("Muy buen promedio");
       }
       else if (promedio >= 5.0){
           System.out.println("buen promedio");
       }
       else if(promedio >= 4){
           System.out.println("Promedio regular, necesitas esforzarte más");
       }
       else{
           System.out.println("Reprobado");
       }

        System.out.println("Tu promedio es = " + promedio);

    }
}
