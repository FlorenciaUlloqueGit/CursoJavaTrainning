import java.util.Locale;

public class EjemploStringMetodos
{
    public static void main(String[] args) {

        String nombre = "Florencia";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase(Locale.ROOT) = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Florencia\") = " + nombre.equals("Florencia"));
        System.out.println("nombre.equals(\"Florencia\") = " + nombre.equals("florencia")); // = falso xq es != el valor
        System.out.println("nombre.equalsIgnoreCase(\"florencia\") = " + nombre.equalsIgnoreCase("florencia")); //ignora mayus y minus
        System.out.println("nombre.compareTo(\"\") = " + nombre.compareTo("Florencia")); //compara el orden lexicográfico. Si da 0 es =
        System.out.println("nombre.compareTo(\"Andrés\") = " + nombre.compareTo("Andrés")); //es mayor
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); //segun la posicion de los caracteres te devuelve la letra.
        System.out.println("nombre.charAt(0) = " + nombre.charAt(1)); //segun la posicion de los caracteres.
        System.out.println("nombre.charAt(0) = " + nombre.charAt(4)); //segun la posicion de los caracteres.
        System.out.println("nombre.length(-1) = " +nombre.charAt(nombre.length()-1)); //te devuelve el ultimo caracter

                        //arranca desde  0
        //Substrung es dinámico y no estático.
        System.out.println("nombre.substring(1) = " + nombre.substring(1));//toma la cadena desde el caracter especificado. Devuelve lorencia
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4)); //el ultimo caracter no se incluye = lor
        System.out.println("nombre = " + nombre);
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));
        
        
        
        String trabaLengua = "trabaLenguas";
        System.out.println("trabaLengua = " + trabaLengua.replace("a", "+")); //remplaza todos los caracteres "a" por "*"
        System.out.println("trabaLengua = " + trabaLengua); //no se cambia proque es inmutalbe.
        System.out.println("trabaLengua.indexOf() = " + trabaLengua.indexOf('a'));//permite saber si se encuentra un caracter adentro del string y retorna el índice. Entrega solo la 1era pos
        System.out.println("trabaLengua.lastIndexOf(\"a\") = " + trabaLengua.lastIndexOf('a')); //retorna el indice de la primera pos de atras ´para adelante del caracter encotnrado especificado x paramentro
        System.out.println("trabaLengua.lastIndexOf(\"z\") = " + trabaLengua.indexOf("z")); //devuelve -1 si no se encuentra
        System.out.println("trabaLengua.contains(\"a\") = " + trabaLengua.contains("t")); //retorna true porque existe el caracter
        System.out.println("trabaLengua.contains(\"z\") = " + trabaLengua.contains("z"));
        System.out.println("trabaLengua.startsWith(\"Lenguas\") = " + trabaLengua.startsWith("Lenguas")); //si empieza con.. falso
        System.out.println("trabaLengua.startsWith(\"traba\") = " + trabaLengua.startsWith("traba")); //true
        System.out.println("trabaLengua.endsWith(\"Lenguas\") = " + trabaLengua.endsWith("Lenguas")); //si termina con esa cadena
        System.out.println("  trabalenguas "); //con espacios
        System.out.println("  trabalenguas ".trim()); //trim saca los espacios de izquierda a derecha


    }
}
