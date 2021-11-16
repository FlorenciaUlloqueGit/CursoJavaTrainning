import java.io.IOException;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime(); //la clase runtime permite abrir otros programas
        Process proceso;
        //abro el editor de notepad desde acá


        try {
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {//para saber el nombre del so.
                proceso = rt.exec("notepad");
            } else if(System.getProperty("os.name").toLowerCase().startsWith("mac")){
                proceso = rt.exec("textedit");
            } else if(System.getProperty("os.name").toLowerCase().contains("nux") ||
            System.getProperty("os.name").toLowerCase().contains("nix")){
                proceso = rt.exec("gedit");
            }
            else {
                proceso = rt.exec("gedit");
            }
          proceso.waitFor();
        }  catch (IOException | InterruptedException e) {
            System.err.println("El comando es desconocido " + e.getMessage());
            System.exit(1);
        }
        System.out.println("se ha cerrado el editor");
        System.exit(0);
    }

}
