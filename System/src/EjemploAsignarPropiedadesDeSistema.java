import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/configuracion2.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "mi valor guardado en el objeto properties");
           System.setProperties(p); //agrega a la lista las nuevas propiedades y todas nuestras config personalizadas
            
            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(\"mi.propiedad.personalizada\") = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("configuracion.texto.ambiente"));
            System.out.println(System.getProperty("configuracion.puerto.servidor"));
            System.out.println(System.getProperty("configuracion.autor.nombre")); //coin get property obtenemos esta configuracion y la podemos usar.
            ps.list(System.out);
            System.getProperties().list(System.out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("No existe el archivo " + e);
        } catch (Exception e) {
            System.out.println("no existe el archivo");
        }
    }
}
