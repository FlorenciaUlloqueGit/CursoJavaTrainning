package Imprenta.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements  Imprimible{
    List<Imprimible> paginas; //al ponerle imprimible en vez de hoja  hace que la implementación sea más generica
    private Persona autor;
    private String nombre;
    private Genero genero;

    public Libro(Persona autor, String nombre, Genero genero) {
        this.autor = autor;
        this.nombre = nombre;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina(Imprimible pagina) {
        paginas.add(pagina);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Titulo: ");

        sb.append(this.nombre).append("\n")
                .append("Autor: " + this.autor.getNombre() + " "+ this.autor.getApellido()).append("\n")
                .append("Genero: ").append(genero).append("\n");
        for (Imprimible pagina : this.paginas) {

            sb.append(pagina.imprimir()).append("\n");
        }
        return sb.toString();
    }


}
