public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        String detalle = curso + "Con el instructor " + profesor;
        System.out.println( detalle);

        int numeroA = 10;
        int numeroB= 5;
        System.out.println(detalle + numeroA + numeroB); //no suma sino que concatena porque encontró un String antes,
        //si quiere que se sume, se debe poner entre paréntesis lo primero.
        System.out.println(detalle + (numeroA + numeroB));
        System.out.println (numeroA + numeroB + detalle ); //aca suma porque lo primero que se encuentra es un operador numérico.

        String detalle2 = curso.concat(" con " .concat(profesor)); //une Strings y genera una instancia nueva, ya que los string son inmutables y no cambian
        String detalle3 = curso.concat(" con ") .concat(profesor); //otra forma de concatenar con anidación dando el mismo resultado.
        System.out.println("detalle2 = " + detalle2);
        System.out.println("detalle3 = " + detalle3);







    }
}
