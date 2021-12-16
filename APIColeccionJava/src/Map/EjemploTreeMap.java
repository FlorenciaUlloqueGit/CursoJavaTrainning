package Map;

import java.util.*;

public class EjemploTreeMap { //es parte de la interfaz de java y obtenemos objetros mediante la llave y valor
    public static void main(String[] args) {


        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed()); //com,para por el largo del String


        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("email", "john.doe@gmail.com");
        persona.put("edad", 30);


        Map<String, String> direccion = new TreeMap<>(); //el treeMap es ordenado
        direccion.put("pais", "USA");
        direccion.put("estado", "california");
        direccion.put("ciudad", "santa barbara");
        direccion.put("calle", "one Street");
        direccion.put("numero", "1534");

        persona.put("direccion", direccion);
        System.out.println("persona = " + persona);

    }


}
