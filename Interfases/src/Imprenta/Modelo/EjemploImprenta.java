package Imprenta.Modelo;
import static Imprenta.Modelo.Genero.*;
import static Imprenta.Modelo.Imprimible.imprimir;
import static Imprenta.Modelo.Imprimible.TEXTO_DEFECTO;
import static Imprenta.Modelo.Imprimible.*;

public class EjemploImprenta {
    public static void main(String[] args) {


        Curriculo cv = new Curriculo(new Persona("John", "doe"), "Ingeniero en sistemas", "resumen laboral....");
        cv.addExperiencia("java");
        cv.addExperiencia("spring");
        cv.addExperiencia("c#");
        cv.addExperiencia("sql");
        cv.addExperiencia("Desarrollador fullstack");



        Libro libro = new Libro(    new Persona("Eric ", "Gamma"), "patrones de diseño: elementos reusables POO", Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patrón singletom"))
                 .addPagina(new Pagina("patron observador"))
                .addPagina(new Pagina("Patron factory"))
                .addPagina(new Pagina("Patron Composite"));



        Persona p3 = new Persona("Julio", "Bravo");
        Persona p4 = new Persona("Martin", "R.loock");

        Informe informe = new Informe(p3, p4, "Estudio sobre microservicios");
        imprimir(cv);  //llama al import del metodo static
        Imprimible.imprimir(informe);
        Imprimible.imprimir(libro); //llama al método estático de la interfaz

//clase anónima que implementa la interface ( no se asigna el nombre de la clase ni se encuentra entre las clases)
        imprimir(new Imprimible() {
            public String imprimir(){
                //imprime el texto por defecto porque no se le asigna una clase a imprimir
                return "Hola imprimiendo un objeto de una clase anónima";
            }

        });

       //  System.out.println(Imprimible.TEXTO_DEFECTO);
        System.out.println(TEXTO_DEFECTO);
    }

}
