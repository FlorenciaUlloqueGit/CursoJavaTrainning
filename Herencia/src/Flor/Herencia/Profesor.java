package Flor.Herencia;

public class Profesor extends Persona {
   private String asignatura;

   public  Profesor(){
       System.out.println("Profe: inicializando constructor");
   }
    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public Profesor (String nombre, String apellido, String asignatura){
       super(nombre, apellido);
       this.asignatura = asignatura;

    }

    @Override
    public String saludar() {
        return "buenos dias soy el profesor de " + getAsignatura() +
                 "y me llamo " + getNombre(); //al no tener super se modifica desde 0 u ni se redefine
    }

    @Override
    public String toString() {
        return super.toString() +
                " \n asignatura='" + asignatura;
    }
}
