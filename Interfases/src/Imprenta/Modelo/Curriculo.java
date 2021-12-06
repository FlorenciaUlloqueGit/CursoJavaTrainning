package Imprenta.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible{

    private Persona persona;
    private String carrera;
    private List<String> experiencia;

    public Curriculo(Persona persona, String carrera,  String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencia = new ArrayList<>();
    }

    public Curriculo addExperiencia (String ex){
        experiencia.add(ex);
        return this;

    }

   @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append(persona.getNombre()+ " " +persona.getApellido()).append("\n")
                .append("resumen: ").append(this.contenido)
                .append("\n Carrera: ").append(this.carrera)
                .append("\n experiencia:  \n ");
                for(String exp : this.experiencia){
                    sb.append(" - ").append(exp).append("\n");

                }

        return sb.toString();
    }


}
