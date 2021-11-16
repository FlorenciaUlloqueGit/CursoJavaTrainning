import java.util.Map;

public class EjemploVariablesDEEntorno {
    public static void main(String[] args) {

        Map<String, String > varEnv = System.getenv();
        System.out.println("variable de ambiente = " + varEnv); //obtengo todas las variables de ambiente

        System.out.println("Listando variables del entorno del sistema");
        for (String key: varEnv.keySet()) {
            System.out.println(" key  = " +  varEnv.get(key) );

        }
        String username = System.getenv("Username"); //para obtener nuestro usuario
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("Path");
        System.out.println("path = " + path);

        String path2 = varEnv.get("Path"); //aca  lo obtengo de la variable del mapa
        System.out.println("path2 = " + path2);

        String appEnv = varEnv.get("APPLICATION_ENV"); //Al haberla creado recien hay que reiniciar el ide para que la  tome;
        System.out.println("appEnv = " + appEnv) ;

        String hola = varEnv.get("SALUDAR_HOLA");
        System.out.println("hola = " + hola);
        
    }

}
