package FlorenciaUlloque.app.Jardin;
import FlorenciaUlloque.app.Jardin.Perro;
//import FlorenciaUlloque.app.hogar.ColorPelo;
import FlorenciaUlloque.app.hogar.Persona; //habilita las clases par que las  podamos usar.
import static FlorenciaUlloque.app.hogar.Persona.saludar;
import static FlorenciaUlloque.app.hogar.Persona.Genero_FEMENINO;
import static FlorenciaUlloque.app.hogar.Persona.Genero_MASCULINO;
import static FlorenciaUlloque.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

     //   FlorenciaUlloque.app.hogar.Persona p = new FlorenciaUlloque.app.hogar.Persona();
       Persona p = new Persona();
       p.setNombre("Florencia");
        System.out.println("p. = " + p.getNombre());
        p.setColor(BROWN);

       // Gato g = new Gato(); no puede acceder porque gato es privado y no esta dentro del paquete FlorenciaUlloque.app
        Perro per = new Perro(); // no hace falta importar porque esta en el mismo package que el main
        System.out.println("per.nombre = " + per.nombre);
        System.out.println("per.raza = " + per.raza);


        String jugando = per.jugar(p);

        System.out.println("jugando = " + jugando);

        String saludo = saludar(); //import estatico
       // String generoMujer = Persona.Genero_FEMENINO;
         String generoMujer = Genero_FEMENINO;
        System.out.println("generoMujer = " + generoMujer);
        String genMasc = Genero_MASCULINO;
        System.out.println("genMasc = " + genMasc);


    }
}
