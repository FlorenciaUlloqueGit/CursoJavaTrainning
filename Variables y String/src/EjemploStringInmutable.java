public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado); //false.

        String resultado2 = curso.transform(c -> { // forma para convertir un String y concatenar.usa expresión lamda.

            return c + " con " + profesor;

        });
        System.out.println("curso = " + curso); //curso se mantiene inmutable, no se altera
        System.out.println("resultado2 = " + resultado2); //aca varia porque es una nueva variable, la variable curso ya no cambia.

        resultado.replace("a", "A"); //no varía porque es String es inmutable.
        System.out.println("resultado = " + resultado);
       String  resultado3 =  resultado.replace("a", "A");
        System.out.println("resultado3 = " + resultado3); //acá si varía
    }
}
