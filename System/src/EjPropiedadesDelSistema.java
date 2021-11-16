import java.util.Properties;

public class EjPropiedadesDelSistema {
    public static void main(String[] args) {
        String username = System.getProperty("user.name"); //para obtener el nombre de usuario del dispositivo
        System.out.println("username = " + username);


        String home = System.getProperty("user.home"); //direccion de usuario
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace); //dondeesta guardado el proyecto

        String java = System.getProperty("java.version");
        System.out.println("java = " + java); //versión de java



        String lineSeparator = System.getProperty("line.separator"); //salto e línea.
        System.out.println("lineSeparator + \"una línea nueva\" = " + lineSeparator + "una línea nueva");

        
        Properties p = System.getProperties(); //retorna todas las propiedades del sistema
        p.list(System.out); //imprime la lista en la pantalla

        
    }
}
