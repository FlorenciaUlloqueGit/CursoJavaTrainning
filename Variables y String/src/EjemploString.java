public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java"); //otra forma de crear una clase String.
        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual); //da falso porque compara las instancias y se crearon !=


        esIgual = curso.equals(curso2);
        System.out.println("esIgual = " + esIgual); //da true porque las cadenas son iguales segun su valor. si cambio un acento o may o minus ya es false.

        esIgual = curso.equalsIgnoreCase(curso2); //ignora mayus y minus.

        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println(" curso == curso3 =  " + esIgual); //es true pero porque no se crea un nuevo objeto sino que se asigna la referencia del curso que ya existe.






    }
}
