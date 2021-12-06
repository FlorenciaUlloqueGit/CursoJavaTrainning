package Imprenta.Modelo;

abstract public class Hoja {

    protected String contenido;

    abstract public String imprimir(); //obliga a las clases hijas a siempre implementar el toString, independientemente de si la interfaz es o no default

    public Hoja(String contenido) {
        this.contenido = contenido;
    }


}
