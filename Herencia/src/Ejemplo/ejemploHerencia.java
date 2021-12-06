package Ejemplo;

import Flor.Herencia.Alumno;
import Flor.Herencia.AlumnoInternacional;
import Flor.Herencia.Persona;
import Flor.Herencia.Profesor;

public class ejemploHerencia {
    public static void main(String[] args) {
        Persona alumno = new Alumno(); //se puede hacer asi pero solo se heredan los datos de persona
        Profesor profesor = new Profesor();
        alumno.setApellido("Gomez");
        alumno.setNombre("mateo");
        ((Alumno) alumno).setInstitucion("Santa Margarita"); //para heredar datos de alumnos debo castear alumno
        ((Alumno) alumno).setNotaHist(5);
        ((Alumno)alumno).setNotaLengua(8);
        ((Alumno) alumno).setNotaMate(9);

        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("parker");
        alumnoInt.setPais("EEUU");
        alumnoInt.setInstitucion("hardvard");
        alumnoInt.setNotaLengua(6.5);
        alumnoInt.setNotaHist(5.8);
        alumnoInt.setNotaIdiomas(9);
        alumnoInt.setNotaMate(7);


        profesor.setApellido("Botta");
        profesor.setNombre("Gino");
        profesor.setAsignatura("Matematica");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido() + "  colegio :" +( (Alumno)alumno).getInstitucion());

        System.out.println("Profesor: "+ profesor.getNombre() +" "+ profesor.getApellido() +
        "  Materia: " + profesor.getAsignatura());

        Class claseAlumnoInternacional = alumnoInt.getClass();
        while (claseAlumnoInternacional.getSuperclass() != null){
            String hija = claseAlumnoInternacional.getName();
            String padre = claseAlumnoInternacional.getSuperclass().getName();
            System.out.println("hija = " + hija);
            System.out.println("padre = " + padre);
            claseAlumnoInternacional = claseAlumnoInternacional.getSuperclass();
        }
    }
}
