package Map;

import java.util.*;

public class EjemploHashMap { //es parte de la interfaz de java y obtenemos objetros mediante la llave y valor
    public static void main(String[] args) {


        Map<String, Object> persona = new HashMap<>();

        System.out.println("contiene elementos= " + !persona.isEmpty());
        persona.put("nombre","John"); //cada llave corresponde al atributo de la persona y cada valor, el valor del atributo
        persona.put("apellido", "Doe");
        persona.put("email", "john.doe@gmail.com");
        persona.put("edad", 30);
        persona.put(null, "1234"); //la llave acepta null pero uno solo porque las llaves siempre son únicas, igual que el resto de las llaves


        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "california");
        direccion.put("ciudad", "santa barbara");
        direccion.put("calle", "one Street");
        direccion.put("numero", "1534");

        persona.put("direccion", direccion);

        System.out.println("persona = " + persona);


        String nombre = (String) persona.get("nombre");
        System.out.println("nombre = " + nombre);

        String apellido = (String) persona.get("apellido");
        System.out.println("apellido = "+ apellido); //obtenemos datos especificos a traves de las llaves

        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");

        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");
        String barrio = direccionPersona.getOrDefault("barrio", "la playa");

        System.out.println("el pais de " + nombre + " es : " + pais);
        System.out.println("la ciudad  de " + nombre + " es : " + ciudad);
        System.out.println("el barrio de " + nombre + " es : " + barrio );

        System.out.println();
       // persona.clear();// elimina todos los valores asociativos del mapa
       // boolean b  =  persona.remove("apellido", "Doe");
      //  System.out.println("b = " + b);
       String valorApellido = (String) persona.remove("apellido");
        System.out.println("valorApellido = " + valorApellido);
        System.out.println("persona = " + persona);
        
        boolean b2 = persona.containsKey("apellido"); //tiene que ser false porque lo eliminamos
        System.out.println("b2 = " + b2);
        
        b2 = persona.containsValue("john.doe@gmail.com"); //por el valor y no por la llave con el value
        System.out.println("b2 = " + b2);
        System.out.println();
        Collection<Object> valores = persona.values();
        for (Object v: valores ) { //no mantiene el orden.
            System.out.println("v = " + v);
            
        }
        Set<String> llaves = persona.keySet(); //muestra las llaves
        for (String llave: llaves
             ) {
            System.out.println("llave = " + llave);
        }

        System.out.println("============================= EntrySet");
        for(Map.Entry<String, Object> par:persona.entrySet()){ //se itera con poares y valores usando entrySet
           Object valor = par.getValue();
            if(valor instanceof Map) {
                String nom = (String) persona.get("nombre");
                Map<String, String> dir2 = (Map<String, String>) valor;
                for (Map.Entry<String, String> parDir : dir2.entrySet()) {
                    System.out.println(parDir.getKey() + " =>" + parDir.getValue());
                }
            }
            else {
                System.out.println(par.getKey() + " => " + valor);
            }
            /*
                System.out.println("el pais de la persona "+ nombre+ ": "
                        + dir2.get("pais"));
                System.out.println("La ciudad de " + nombre+ ": "
                        + dir2.get("ciudad"));
                System.out.println("el estado de " + nombre+ ": "
                        + dir2.get("estado"));

            }
            else{
                System.out.println(par.getKey() + "=>" + valor);
            }

             */
        }

        System.out.println("============================= KeySet");
        for(String llave: persona.keySet()){ //lo mismo que el metodo anterior
            Object valor = persona.get(llave); //con get obtengo el valor a traves de la llave
            System.out.println(llave + " => " + valor);
            if(valor instanceof Map){
                String nom = (String) persona.get("nombre");
                Map<String, String> dir2 = (Map<String, String>) valor;
                System.out.println("el pais de la persona "+ nombre+ ": "
                        + dir2.get("pais"));
                System.out.println("La ciudad de " + nombre+ ": "
                        + dir2.get("ciudad"));
                System.out.println("el estado de " + nombre+ ": "
                        + dir2.get("estado"));

            }

        }
        System.out.println("============================= Java 8 forEach");

        persona.forEach((llave,valor) -> { //lo mismo que el metodo anterior
            System.out.println(llave + " => "+ valor);
        });


        System.out.println("Total : " + persona.size());
        System.out.println("contiene elementos= " + !persona.isEmpty());


        System.out.println();
        persona.replace("nombre", "Andres");
        System.out.println("persona = " + persona);

        System.out.println();
        //retorna true o false dependiendo de si se puede modificar o no
        persona.replace("nombre", "Andres", "Juan"); //reemplaza el viejo valor de la llave por uno nuevo
        System.out.println("persona = " + persona);
    }


}
