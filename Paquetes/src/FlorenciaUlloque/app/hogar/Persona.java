package FlorenciaUlloque.app.hogar;

import jdk.jshell.execution.StreamingExecutionControl;

public class Persona {


    private String nombre; //se puede usar persona pero no se puede acceder a un atributo que sea default
    private ColorPelo color;
   private String apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ColorPelo getColor() {
        return color;
    }

    public void setColor(ColorPelo color) {
        this.color = color;
    }

    public String lanzarPelota(){
        return "lanza la pelota al perro!";
    }

    public static String saludar(){
       return "hola que tal";
    }
    public static final String Genero_MASCULINO = "masculino";
    public static final String Genero_FEMENINO = "femenino";
}
