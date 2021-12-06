package Ejemplo;

import Flor.Herencia.Alumno;
import Flor.Herencia.AlumnoInternacional;
import Flor.Herencia.Persona;
import Flor.Herencia.Profesor;

public class ejemploHerenciaToString {
    public static void main(String[] args) {
        Persona alumno = new Alumno("mateo", "gomez", 35, "san salvador", 5, 7, 9);


        ((Alumno) alumno).setNotaHist(5);
        ((Alumno) alumno).setNotaLengua(8);
        ((Alumno) alumno).setNotaMate(9);

        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "parker", "EEUU", 8);

        alumnoInt.setInstitucion("hardvard");
        alumnoInt.setNotaLengua(6.5);
        alumnoInt.setNotaHist(5.8);
        alumnoInt.setNotaMate(7);

        Profesor profesor = new Profesor("Gino", "Botta", "Matematica");


        System.out.println(alumno.getNombre() + " " + alumno.getApellido() + "  colegio :" + ((Alumno) alumno).getInstitucion());

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }

    public static void imprimir(Persona p) {

            System.out.println("=======================================");
            System.out.println( p);



    }
}


